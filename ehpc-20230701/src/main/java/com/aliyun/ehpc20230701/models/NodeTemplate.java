// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class NodeTemplate extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("DataDisks")
    public java.util.List<NodeTemplateDataDisks> dataDisks;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("EnableHT")
    public Boolean enableHT;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDisk")
    public NodeTemplateSystemDisk systemDisk;

    public static NodeTemplate build(java.util.Map<String, ?> map) throws Exception {
        NodeTemplate self = new NodeTemplate();
        return TeaModel.build(map, self);
    }

    public NodeTemplate setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public NodeTemplate setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public NodeTemplate setDataDisks(java.util.List<NodeTemplateDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<NodeTemplateDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public NodeTemplate setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public NodeTemplate setEnableHT(Boolean enableHT) {
        this.enableHT = enableHT;
        return this;
    }
    public Boolean getEnableHT() {
        return this.enableHT;
    }

    public NodeTemplate setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public NodeTemplate setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public NodeTemplate setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public NodeTemplate setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public NodeTemplate setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public NodeTemplate setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public NodeTemplate setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public NodeTemplate setSystemDisk(NodeTemplateSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public NodeTemplateSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public static class NodeTemplateDataDisks extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Level")
        public String level;

        @NameInMap("Size")
        public Integer size;

        public static NodeTemplateDataDisks build(java.util.Map<String, ?> map) throws Exception {
            NodeTemplateDataDisks self = new NodeTemplateDataDisks();
            return TeaModel.build(map, self);
        }

        public NodeTemplateDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public NodeTemplateDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public NodeTemplateDataDisks setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public NodeTemplateDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class NodeTemplateSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Level")
        public String level;

        @NameInMap("Size")
        public Integer size;

        public static NodeTemplateSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            NodeTemplateSystemDisk self = new NodeTemplateSystemDisk();
            return TeaModel.build(map, self);
        }

        public NodeTemplateSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public NodeTemplateSystemDisk setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public NodeTemplateSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
