// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateWuyingServerRequest extends TeaModel {
    /**
     * <p>The number of workstations to create. Default value: 1. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment. Default value: false.</p>
     * <ul>
     * <li>true: attempts to automatically pay when the order is placed.</li>
     * <li>false: manually pays after the order is created.</li>
     * </ul>
     * <p>A returned workstation ID does not indicate that the resource has been created. You must still confirm that the order payment is completed and query the workstation status.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Default value: false.</p>
     * <ul>
     * <li>true: enables auto-renewal.</li>
     * <li>false: disables auto-renewal.</li>
     * </ul>
     * <p>Whether this parameter can be configured depends on the sales rules of the selected billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The bandwidth. Unit: Mbit/s. If this parameter is specified, the value must be greater than 0 and cannot exceed 1000.</p>
     * <p>This parameter is required when NetworkStrategyType is set to DirectIp. The value must also meet the actual available configurations of the target region and office network.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method. <strong>This parameter is required.</strong> If this parameter is not specified or an unrecognized value is passed, InvalidParameter.chargeType is returned.</p>
     * <ul>
     * <li>PrePaid: subscription. You must specify both Period and PeriodUnit, and use the matching SubPayType=prePaid.</li>
     * <li>PostPaid: pay-as-you-go. The sub-billing method and specification must support the corresponding sales method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The list of data cloud disks. This parameter is optional. You can specify up to 16 data cloud disks, and the number cannot exceed the maximum number supported by the selected workstation specification. The data cloud disk types and performance levels in the same request must be the same. The capacity of each data cloud disk is verified separately.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateWuyingServerRequestDataDisk> dataDisk;

    /**
     * <p>Specifies whether to enable the dedicated eRDMA NIC.</p>
     * <ul>
     * <li>true: enables the dedicated eRDMA NIC.</li>
     * <li>false: disables the dedicated eRDMA NIC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ErdmaEnabled")
    public Boolean erdmaEnabled;

    /**
     * <p>The configuration version of the GPU driver, such as grid19.</p>
     * 
     * <strong>example:</strong>
     * <p>grid19</p>
     */
    @NameInMap("GpuDriverVersion")
    public String gpuDriverVersion;

    /**
     * <p>The hostname. The limits are as follows:</p>
     * <ul>
     * <li><p>The hostname cannot start or end with a period (.) or a hyphen (-). Consecutive periods or hyphens are not allowed.</p>
     * </li>
     * <li><p>Windows workstation: The hostname must be 2 to 15 characters in length. Periods (.) are not supported. Consecutive hyphens are not allowed. The hostname cannot contain only digits. It can contain uppercase and lowercase letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>Linux workstation:</p>
     * <ul>
     * <li><p>The hostname must be 2 to 64 characters in length. Multiple periods (.) are supported. The string between two periods is a segment. Each segment can contain uppercase and lowercase letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>You can use the ${instance_id} placeholder to write the instance ID into the HostName parameter. For example, if HostName=k8s-${instance_id} and the created ECS instance ID is i-123abc****, the hostname of the instance is k8s-i-123abc****.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>When you create multiple workstation instances at a time, you can use the name_prefix[begin_number,bits]name_suffix naming format to name the workstations uniformly. For example, if HostName is set to ecd-[1,4]-test, the hostname of the first workstation is ecd-0001-test, the hostname of the second workstation is ecd-0002-test, and so on.</p>
     * <ul>
     * <li><p>name_prefix: the prefix of the hostname.</p>
     * </li>
     * <li><p>[begin_number,bits]: the sequential number in the hostname.</p>
     * <ul>
     * <li><p>begin_number: the start number. Valid values: 0 to 999999. Default value: 0. If the specified value is invalid, 0 is used.</p>
     * </li>
     * <li><p>bits: the number of digits. Valid values: 1 to 6. Default value: 6. If the specified value is invalid, 6 is used.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>name_suffix: the suffix of the hostname.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testhost</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The idempotence token that ensures the uniqueness of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>6a1b8c3d</p>
     */
    @NameInMap("IdempotenceToken")
    public String idempotenceToken;

    /**
     * <p>The ID of the workstation image. <strong>This parameter is required when you create a workstation by calling this operation.</strong> If this parameter is not specified, InvalidParameter.imageId is returned.</p>
     * <p>You can call ListImage to obtain the image ID applicable to the target workstation.
     * <a href="~~ListImage~~">ListImage</a></p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The maximum bid for a preemptible workstation. This parameter is required when ChargeType is set to PostPaid and SubPayType is set to spot. If this parameter is not specified, InvalidParameter.maxPrice is returned. The final availability for purchase depends on the preemptible sales rules of the target specification.</p>
     * 
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The type of the network policy (invitational preview).</p>
     * 
     * <strong>example:</strong>
     * <p>DirectIp</p>
     */
    @NameInMap("NetworkStrategyType")
    public String networkStrategyType;

    /**
     * <p>The ID of the office network. To specify an office network, specify the ID of an office network available for the current account in the target region.</p>
     * <p>If this parameter is not specified, the service attempts to reuse a valid office network configured for the current account in the region. If no reusable network is available, a default office network is created. If this process fails, the workstation creation fails.</p>
     * <p>The office network ID is different from the region ID and zone ID. You cannot use the zone ID returned by ListZones as a substitute.
     * <a href="~~ListZones~~">ListZones</a></p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-643067****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The logon password of the workstation. <strong>This parameter is required when you create a workstation by calling this operation.</strong> If this parameter is not specified, InvalidParameter.password is returned.</p>
     * <p>The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Spaces, Chinese characters, backslashes, and double quotation marks are not supported. The supported special characters are:</p>
     * <pre><code class="language-text">()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>The password of a Windows workstation cannot start with a forward slash /.</p>
     * 
     * <strong>example:</strong>
     * <p>YourPassword123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The numeric part of the subscription duration. This parameter is used together with PeriodUnit.</p>
     * <p><strong>This parameter is required when ChargeType is set to PrePaid, and you must also specify PeriodUnit. This parameter has no default value.</strong> If this parameter is not specified, InvalidParameter.period is returned (HTTP status code: 400). For example, Period=1 and PeriodUnit=Month indicate a subscription duration of one month.</p>
     * <p>The numeric value and unit are verified based on the requested combination and are not automatically converted to other periods. The subscription duration must comply with the sales rules of the target workstation commodity. If the order verification determines that the combination exceeds the allowed range, OrderPeriod.Invalid is returned (HTTP status code: 400).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. This parameter is used together with Period.</p>
     * <p><strong>This parameter is required when ChargeType is set to PrePaid, and you must also specify Period.</strong> If this parameter is not specified or an unrecognized unit is passed, InvalidParameter.periodUnit is returned (HTTP status code: 400). The value is case-sensitive.</p>
     * <p>The units recognized by this operation are as follows:</p>
     * <ul>
     * <li>Hour: hour.</li>
     * <li>Day: day.</li>
     * <li>Week: week.</li>
     * <li>Month: month.</li>
     * <li>Year: year.</li>
     * </ul>
     * <p>The actual combinations of units and numeric values available for purchase must comply with the sales rules of the target workstation commodity. A recognizable unit does not mean that the combination is definitely available for purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the discount.</p>
     * <blockquote>
     * <p>If PromotionId is specified, the system attempts to apply the corresponding discount.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The ID of the savings plan.</p>
     * 
     * <strong>example:</strong>
     * <p>spn-ce3f5b4fk**46CY</p>
     */
    @NameInMap("SavingPlanId")
    public String savingPlanId;

    /**
     * <p>The workstation specification. <strong>This parameter is required.</strong> If this parameter is not specified, InvalidParameter.serverInstanceType is returned.</p>
     * <p>You can call ListNodeInstanceType to query the specifications available for purchase in the target region and confirm that they support the selected billing method.
     * <a href="~~ListNodeInstanceType~~">ListNodeInstanceType</a></p>
     * 
     * <strong>example:</strong>
     * <p>eds.proworkstation_flagship_elite_ne.96c384g.192g4x</p>
     */
    @NameInMap("ServerInstanceType")
    public String serverInstanceType;

    /**
     * <p>The service port range.</p>
     * 
     * <strong>example:</strong>
     * <p>22/22</p>
     */
    @NameInMap("ServerPortRange")
    public String serverPortRange;

    /**
     * <p>The sub-billing method. This parameter must match ChargeType and the sales method of the target specification.</p>
     * <p>Billing combinations for Enterprise Edition workstations:</p>
     * <ul>
     * <li>ChargeType=PrePaid: use prePaid, which indicates subscription. It cannot be used with postPaid.</li>
     * <li>ChargeType=PostPaid: usually use postPaid, which indicates pay-as-you-go. If you use spot for preemptible billing, you must also specify MaxPrice, and the target specification must support this method.</li>
     * </ul>
     * <p>If this parameter is not specified, the default value for PrePaid is prePaid, and the default value for PostPaid is postPaid. Incompatible combinations may return InvalidOrder.CommodityCodeNotMatch.</p>
     * <p>The meanings of the enumerated values are as follows. The actual availability depends on the sales method of the target resource. You cannot arbitrarily combine different billing methods.</p>
     * <ul>
     * <li>prePaid: subscription.</li>
     * <li>postPaid: pay-as-you-go.</li>
     * <li>spot: preemptible billing.</li>
     * <li>duration: duration package.</li>
     * <li>mau: pay-as-you-go based on the number of monthly active users.</li>
     * <li>monthPackage: monthly package.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>prePaid</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>The type of the system cloud disk. Default value: cloud_auto.</p>
     * <ul>
     * <li>cloud: basic cloud disk.</li>
     * <li>cloud_efficiency: ultra cloud disk.</li>
     * <li>cloud_ssd: standard SSD cloud disk.</li>
     * <li>cloud_essd: ESSD cloud disk.</li>
     * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
     * </ul>
     * <p>If you use cloud_essd, you must specify SystemDiskPerformanceLevel. The final availability is subject to the specification, region, and cloud disk capacity limits.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The performance level of the ESSD system cloud disk. This parameter is required when SystemDiskCategory is set to cloud_essd.</p>
     * <ul>
     * <li>PL0: ESSD performance level 0.</li>
     * <li>PL1: ESSD performance level 1.</li>
     * <li>PL2: ESSD performance level 2.</li>
     * <li>PL3: ESSD performance level 3.</li>
     * </ul>
     * <p>The capacity must also meet the 10 GiB step size for the system cloud disk: at least 20 GiB for PL0 and PL1, at least 470 GiB for PL2, and at least 1270 GiB for PL3.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("SystemDiskPerformanceLevel")
    public String systemDiskPerformanceLevel;

    /**
     * <p>The size of the system cloud disk. Unit: GiB. Default value: 200. The value must be a multiple of 10. The general valid range is 20 to 65536. The value must also meet the capacity limits of the selected cloud disk type and performance level.</p>
     * <p>The maximum size of a basic cloud disk is 2000 GiB. The maximum size of a standard SSD cloud disk or ultra cloud disk is 32768 GiB. If the system cloud disk capacity required by the selected image is greater than the requested value, the capacity required by the image is used during creation.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The list of office network vSwitches.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The ID of the existing virtual node pool. This parameter is optional. If this parameter is specified, the node pool must exist and belong to the current account.</p>
     * <p>This operation associates the workstation with an existing node pool and does not create a node pool. If this parameter is not specified, this association is not established.</p>
     * 
     * <strong>example:</strong>
     * <p>vnp-0b************gyw</p>
     */
    @NameInMap("VirtualNodePoolId")
    public String virtualNodePoolId;

    /**
     * <p>The name of the workstation. When multiple workstations are created, a numeric suffix is automatically added.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleServerName</p>
     */
    @NameInMap("WuyingServerName")
    public String wuyingServerName;

    public static CreateWuyingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWuyingServerRequest self = new CreateWuyingServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateWuyingServerRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateWuyingServerRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateWuyingServerRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateWuyingServerRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateWuyingServerRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateWuyingServerRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateWuyingServerRequest setDataDisk(java.util.List<CreateWuyingServerRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateWuyingServerRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateWuyingServerRequest setErdmaEnabled(Boolean erdmaEnabled) {
        this.erdmaEnabled = erdmaEnabled;
        return this;
    }
    public Boolean getErdmaEnabled() {
        return this.erdmaEnabled;
    }

    public CreateWuyingServerRequest setGpuDriverVersion(String gpuDriverVersion) {
        this.gpuDriverVersion = gpuDriverVersion;
        return this;
    }
    public String getGpuDriverVersion() {
        return this.gpuDriverVersion;
    }

    public CreateWuyingServerRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateWuyingServerRequest setIdempotenceToken(String idempotenceToken) {
        this.idempotenceToken = idempotenceToken;
        return this;
    }
    public String getIdempotenceToken() {
        return this.idempotenceToken;
    }

    public CreateWuyingServerRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateWuyingServerRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public CreateWuyingServerRequest setNetworkStrategyType(String networkStrategyType) {
        this.networkStrategyType = networkStrategyType;
        return this;
    }
    public String getNetworkStrategyType() {
        return this.networkStrategyType;
    }

    public CreateWuyingServerRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateWuyingServerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateWuyingServerRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateWuyingServerRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateWuyingServerRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateWuyingServerRequest setSavingPlanId(String savingPlanId) {
        this.savingPlanId = savingPlanId;
        return this;
    }
    public String getSavingPlanId() {
        return this.savingPlanId;
    }

    public CreateWuyingServerRequest setServerInstanceType(String serverInstanceType) {
        this.serverInstanceType = serverInstanceType;
        return this;
    }
    public String getServerInstanceType() {
        return this.serverInstanceType;
    }

    public CreateWuyingServerRequest setServerPortRange(String serverPortRange) {
        this.serverPortRange = serverPortRange;
        return this;
    }
    public String getServerPortRange() {
        return this.serverPortRange;
    }

    public CreateWuyingServerRequest setSubPayType(String subPayType) {
        this.subPayType = subPayType;
        return this;
    }
    public String getSubPayType() {
        return this.subPayType;
    }

    public CreateWuyingServerRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public CreateWuyingServerRequest setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
        this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
        return this;
    }
    public String getSystemDiskPerformanceLevel() {
        return this.systemDiskPerformanceLevel;
    }

    public CreateWuyingServerRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateWuyingServerRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateWuyingServerRequest setVirtualNodePoolId(String virtualNodePoolId) {
        this.virtualNodePoolId = virtualNodePoolId;
        return this;
    }
    public String getVirtualNodePoolId() {
        return this.virtualNodePoolId;
    }

    public CreateWuyingServerRequest setWuyingServerName(String wuyingServerName) {
        this.wuyingServerName = wuyingServerName;
        return this;
    }
    public String getWuyingServerName() {
        return this.wuyingServerName;
    }

    public static class CreateWuyingServerRequestDataDisk extends TeaModel {
        /**
         * <p>The type of the data cloud disk.</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD cloud disk.</li>
         * <li>cloud_essd: ESSD cloud disk.</li>
         * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
         * </ul>
         * <p>If this parameter is not specified, cloud is used. The final availability is subject to the specification, region, and cloud disk capacity limits.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The performance level of the ESSD data cloud disk. This parameter takes effect when cloud_essd is used. Default value: PL1.</p>
         * <ul>
         * <li>PL0: ESSD performance level 0.</li>
         * <li>PL1: ESSD performance level 1.</li>
         * <li>PL2: ESSD performance level 2.</li>
         * <li>PL3: ESSD performance level 3.</li>
         * </ul>
         * <p>Based on the 10 GiB step size for data cloud disks, the minimum capacity is 10 GiB for PL0, 20 GiB for PL1, 470 GiB for PL2, and 1270 GiB for PL3.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
         * <p>The size of the data cloud disk. Unit: GiB. This parameter is required when you configure a data cloud disk. The value must be a positive integer and a multiple of 10, and cannot exceed 65536.</p>
         * <p>The value must also fall within the capacity range of the selected cloud disk type: up to 2000 GiB for a basic cloud disk, 20 to 32768 GiB for a standard SSD cloud disk or ultra cloud disk. An ESSD cloud disk must also meet the minimum capacity requirement of the performance level.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        public static CreateWuyingServerRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateWuyingServerRequestDataDisk self = new CreateWuyingServerRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateWuyingServerRequestDataDisk setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public CreateWuyingServerRequestDataDisk setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        public CreateWuyingServerRequestDataDisk setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

}
