// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateWuyingServerRequest extends TeaModel {
    /**
     * <p>Quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Auto payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>bandwidth value, the NetworkStrategyType is valid for DirectIp. Unit: Mbps, range 2~100</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>Region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The list of data disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateWuyingServerRequestDataDisk> dataDisk;

    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>Idempotence token to ensure operation uniqueness</p>
     * 
     * <strong>example:</strong>
     * <p>6a1b8c3d</p>
     */
    @NameInMap("IdempotenceToken")
    public String idempotenceToken;

    /**
     * <p>The ID of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("MaxPrice")
    public Float maxPrice;

    /**
     * <p>The type of the network policy (in invitational preview).</p>
     * 
     * <strong>example:</strong>
     * <p>DirectIp</p>
     */
    @NameInMap("NetworkStrategyType")
    public String networkStrategyType;

    /**
     * <p>The office network IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-643067****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>Workstation login password.</p>
     * 
     * <strong>example:</strong>
     * <p>YourPassword123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription period.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The time unit.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the discount.</p>
     * <blockquote>
     * <p> If PromotionId is set, it will try to apply the corresponding discount.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("SavingPlanId")
    public String savingPlanId;

    /**
     * <p>Workstation specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.proworkstation_flagship_elite_ne.96c384g.192g4x</p>
     */
    @NameInMap("ServerInstanceType")
    public String serverInstanceType;

    @NameInMap("ServerPortRange")
    public String serverPortRange;

    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>The system disk category.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cloud_auto.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <p>The performance level (PL) of the system disk.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("SystemDiskPerformanceLevel")
    public String systemDiskPerformanceLevel;

    /**
     * <p>The size of the system disk. Unit: GB.</p>
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
     * <strong>example:</strong>
     * <p>vnp-0b************gyw</p>
     */
    @NameInMap("VirtualNodePoolId")
    public String virtualNodePoolId;

    /**
     * <p>The name of the workstation. The numeric suffix is automatically added when multiple workstations are created.</p>
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
         * <p>The data disk category.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cloud_auto.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The PL of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
         * <p>The data disk size.</p>
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
