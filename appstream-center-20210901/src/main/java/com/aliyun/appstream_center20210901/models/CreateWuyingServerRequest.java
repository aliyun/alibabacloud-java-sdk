// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateWuyingServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("DataDisk")
    public java.util.List<CreateWuyingServerRequestDataDisk> dataDisk;

    /**
     * <strong>example:</strong>
     * <p>6a1b8c3d</p>
     */
    @NameInMap("IdempotenceToken")
    public String idempotenceToken;

    /**
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("NetworkStrategyType")
    public String networkStrategyType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-643067****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <strong>example:</strong>
     * <p>YourPassword123</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <strong>example:</strong>
     * <p>eds.proworkstation_flagship_elite_ne.96c384g.192g4x</p>
     */
    @NameInMap("ServerInstanceType")
    public String serverInstanceType;

    /**
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    /**
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("SystemDiskPerformanceLevel")
    public String systemDiskPerformanceLevel;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("VirtualNodePoolId")
    public String virtualNodePoolId;

    /**
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

    public CreateWuyingServerRequest setServerInstanceType(String serverInstanceType) {
        this.serverInstanceType = serverInstanceType;
        return this;
    }
    public String getServerInstanceType() {
        return this.serverInstanceType;
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
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
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
