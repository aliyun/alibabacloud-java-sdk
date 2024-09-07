// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class AddonNodeTemplate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("DataDisks")
    public java.util.List<AddonNodeTemplateDataDisks> dataDisks;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableHT")
    public Boolean enableHT;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_3_x64_20G_alibase_20221102.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c7.4xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS  7.6 64 位</p>
     */
    @NameInMap("OsName")
    public String osName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS  7.6 64 bit</p>
     */
    @NameInMap("OsNameEN")
    public String osNameEN;

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

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <strong>example:</strong>
     * <p>0.97</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDisk")
    public AddonNodeTemplateSystemDisk systemDisk;

    public static AddonNodeTemplate build(java.util.Map<String, ?> map) throws Exception {
        AddonNodeTemplate self = new AddonNodeTemplate();
        return TeaModel.build(map, self);
    }

    public AddonNodeTemplate setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public AddonNodeTemplate setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public AddonNodeTemplate setDataDisks(java.util.List<AddonNodeTemplateDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<AddonNodeTemplateDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public AddonNodeTemplate setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public AddonNodeTemplate setEnableHT(Boolean enableHT) {
        this.enableHT = enableHT;
        return this;
    }
    public Boolean getEnableHT() {
        return this.enableHT;
    }

    public AddonNodeTemplate setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddonNodeTemplate setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public AddonNodeTemplate setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddonNodeTemplate setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public AddonNodeTemplate setOsName(String osName) {
        this.osName = osName;
        return this;
    }
    public String getOsName() {
        return this.osName;
    }

    public AddonNodeTemplate setOsNameEN(String osNameEN) {
        this.osNameEN = osNameEN;
        return this;
    }
    public String getOsNameEN() {
        return this.osNameEN;
    }

    public AddonNodeTemplate setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AddonNodeTemplate setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public AddonNodeTemplate setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public AddonNodeTemplate setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public AddonNodeTemplate setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public AddonNodeTemplate setSystemDisk(AddonNodeTemplateSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public AddonNodeTemplateSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public static class AddonNodeTemplateDataDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static AddonNodeTemplateDataDisks build(java.util.Map<String, ?> map) throws Exception {
            AddonNodeTemplateDataDisks self = new AddonNodeTemplateDataDisks();
            return TeaModel.build(map, self);
        }

        public AddonNodeTemplateDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public AddonNodeTemplateDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public AddonNodeTemplateDataDisks setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AddonNodeTemplateDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class AddonNodeTemplateSystemDisk extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static AddonNodeTemplateSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            AddonNodeTemplateSystemDisk self = new AddonNodeTemplateSystemDisk();
            return TeaModel.build(map, self);
        }

        public AddonNodeTemplateSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public AddonNodeTemplateSystemDisk setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AddonNodeTemplateSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
