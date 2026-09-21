// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateWuyingServerRequest extends TeaModel {
    /**
     * <p>The quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The bandwidth value. This parameter takes effect only when NetworkStrategyType is set to DirectIp. Unit: Mbit/s. Valid values: 2 to 100.</p>
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
     * <p>The billing type.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The list of data cloud disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateWuyingServerRequestDataDisk> dataDisk;

    /**
     * <p>Specifies whether to enable dedicated eRDMA network interfaces.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ErdmaEnabled")
    public Boolean erdmaEnabled;

    /**
     * <p>The GPU driver configuration version, such as grid19.</p>
     * 
     * <strong>example:</strong>
     * <p>grid19</p>
     */
    @NameInMap("GpuDriverVersion")
    public String gpuDriverVersion;

    /**
     * <p>The hostname. The following limits apply:</p>
     * <ul>
     * <li><p>A period (.) or hyphen (-) cannot be used as the first or last character, and consecutive use is not allowed.</p>
     * </li>
     * <li><p>Windows workstations: The hostname must be 2 to 15 characters in length. It cannot contain periods (.), consecutive hyphens, or consist entirely of digits. It can contain uppercase and lowercase letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>Linux workstations:</p>
     * <ul>
     * <li><p>The hostname must be 2 to 64 characters in length and can contain multiple periods (.). Each segment between periods can contain uppercase and lowercase letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>You can use the placeholder <code>${instance_id}</code> to include the instance ID in the HostName parameter. For example, if you set <code>HostName=k8s-${instance_id}</code> and the created ECS instance ID is <code>i-123abc****</code>, the hostname of the instance is <code>k8s-i-123abc****</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>When creating multiple workstation instances at a time, you can use the <code>name_prefix[begin_number,bits]name_suffix</code> naming format to uniformly name multiple workstations. For example, if you set Hostname to <code>ecd-[1,4]-test</code>, the hostname of the first workstation is <code>ecd-0001-test</code>, the hostname of the second workstation is <code>ecd-0002-test</code>, and so on.</p>
     * <ul>
     * <li><p><code>name_prefix</code>: The prefix of the hostname.</p>
     * </li>
     * <li><p><code>[begin_number,bits]</code>: The sequential number in the hostname.</p>
     * <ul>
     * <li><p><code>begin_number</code>: The starting number. Valid values: 0 to 999999. Default value: 0. If an invalid value is specified, the value is set to 0.</p>
     * </li>
     * <li><p><code>bits</code>: The number of digits. Valid values: 1 to 6. Default value: 6. If an invalid value is specified, the value is set to 6.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>name_suffix</code>: The suffix of the hostname.</p>
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
     * <p>The idempotency token that ensures operation uniqueness.</p>
     * 
     * <strong>example:</strong>
     * <p>6a1b8c3d</p>
     */
    @NameInMap("IdempotenceToken")
    public String idempotenceToken;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The maximum price.</p>
     * 
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The network policy type (invite-only preview).</p>
     * 
     * <strong>example:</strong>
     * <p>DirectIp</p>
     */
    @NameInMap("NetworkStrategyType")
    public String networkStrategyType;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-643067****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The workstation logon password.</p>
     * 
     * <strong>example:</strong>
     * <p>YourPassword123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The time unit.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The discount ID.</p>
     * <blockquote>
     * <p>If PromotionId is specified, the corresponding discount is applied.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The savings plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>spn-ce3f5b4fk**46CY</p>
     */
    @NameInMap("SavingPlanId")
    public String savingPlanId;

    /**
     * <p>The workstation instance type.</p>
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
     * <p>The sub-billing type.</p>
     * 
     * <strong>example:</strong>
     * <p>postPaid</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>The system cloud disk type.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The system cloud disk performance level.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("SystemDiskPerformanceLevel")
    public String systemDiskPerformanceLevel;

    /**
     * <p>The system cloud disk size. Unit: GB.</p>
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
     * <p>The virtual node pool ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vnp-0b************gyw</p>
     */
    @NameInMap("VirtualNodePoolId")
    public String virtualNodePoolId;

    /**
     * <p>The workstation name. When creating multiple workstations, a numeric suffix is automatically appended.</p>
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
         * <p>The data cloud disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The data cloud disk performance level.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
         * <p>The data cloud disk size.</p>
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
