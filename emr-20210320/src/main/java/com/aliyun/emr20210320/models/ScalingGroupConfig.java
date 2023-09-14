// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingGroupConfig extends TeaModel {
    /**
     * <p>数据盘类型。</p>
     */
    @NameInMap("DataDiskCategory")
    public String dataDiskCategory;

    /**
     * <p>数据盘个数。</p>
     */
    @NameInMap("DataDiskCount")
    public Integer dataDiskCount;

    /**
     * <p>数据盘大小,单位GB。</p>
     */
    @NameInMap("DataDiskSize")
    public Long dataDiskSize;

    /**
     * <p>默认冷却时间。</p>
     */
    @NameInMap("DefaultCoolDownTime")
    public Long defaultCoolDownTime;

    /**
     * <p>抢占实例列表。</p>
     */
    @NameInMap("InstanceTypeList")
    public java.util.List<InstanceTypeList> instanceTypeList;

    /**
     * <p>资源可用性策略(成本优化参数)。</p>
     */
    @NameInMap("MultiAvailablePolicy")
    public MultiAvailablePolicy multiAvailablePolicy;

    /**
     * <p>节点下线策略。</p>
     */
    @NameInMap("NodeOfflinePolicy")
    public NodeOfflinePolicy nodeOfflinePolicy;

    /**
     * <p>私有池选项	。</p>
     */
    @NameInMap("PrivatePoolOptions")
    public PrivatePoolOptions privatePoolOptions;

    /**
     * <p>伸缩组节点最大个数。</p>
     */
    @NameInMap("ScalingMaxSize")
    public Integer scalingMaxSize;

    /**
     * <p>伸缩组节点最小个数。</p>
     */
    @NameInMap("ScalingMinSize")
    public Integer scalingMinSize;

    /**
     * <p>抢占式Spot实例策略。</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>系统盘类型。</p>
     */
    @NameInMap("SysDiskCategory")
    public String sysDiskCategory;

    /**
     * <p>系统盘大小,单位GB。</p>
     */
    @NameInMap("SysDiskSize")
    public Long sysDiskSize;

    /**
     * <p>伸缩活动触发模式。</p>
     */
    @NameInMap("TriggerMode")
    public String triggerMode;

    public static ScalingGroupConfig build(java.util.Map<String, ?> map) throws Exception {
        ScalingGroupConfig self = new ScalingGroupConfig();
        return TeaModel.build(map, self);
    }

    public ScalingGroupConfig setDataDiskCategory(String dataDiskCategory) {
        this.dataDiskCategory = dataDiskCategory;
        return this;
    }
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    public ScalingGroupConfig setDataDiskCount(Integer dataDiskCount) {
        this.dataDiskCount = dataDiskCount;
        return this;
    }
    public Integer getDataDiskCount() {
        return this.dataDiskCount;
    }

    public ScalingGroupConfig setDataDiskSize(Long dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Long getDataDiskSize() {
        return this.dataDiskSize;
    }

    public ScalingGroupConfig setDefaultCoolDownTime(Long defaultCoolDownTime) {
        this.defaultCoolDownTime = defaultCoolDownTime;
        return this;
    }
    public Long getDefaultCoolDownTime() {
        return this.defaultCoolDownTime;
    }

    public ScalingGroupConfig setInstanceTypeList(java.util.List<InstanceTypeList> instanceTypeList) {
        this.instanceTypeList = instanceTypeList;
        return this;
    }
    public java.util.List<InstanceTypeList> getInstanceTypeList() {
        return this.instanceTypeList;
    }

    public ScalingGroupConfig setMultiAvailablePolicy(MultiAvailablePolicy multiAvailablePolicy) {
        this.multiAvailablePolicy = multiAvailablePolicy;
        return this;
    }
    public MultiAvailablePolicy getMultiAvailablePolicy() {
        return this.multiAvailablePolicy;
    }

    public ScalingGroupConfig setNodeOfflinePolicy(NodeOfflinePolicy nodeOfflinePolicy) {
        this.nodeOfflinePolicy = nodeOfflinePolicy;
        return this;
    }
    public NodeOfflinePolicy getNodeOfflinePolicy() {
        return this.nodeOfflinePolicy;
    }

    public ScalingGroupConfig setPrivatePoolOptions(PrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ScalingGroupConfig setScalingMaxSize(Integer scalingMaxSize) {
        this.scalingMaxSize = scalingMaxSize;
        return this;
    }
    public Integer getScalingMaxSize() {
        return this.scalingMaxSize;
    }

    public ScalingGroupConfig setScalingMinSize(Integer scalingMinSize) {
        this.scalingMinSize = scalingMinSize;
        return this;
    }
    public Integer getScalingMinSize() {
        return this.scalingMinSize;
    }

    public ScalingGroupConfig setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public ScalingGroupConfig setSysDiskCategory(String sysDiskCategory) {
        this.sysDiskCategory = sysDiskCategory;
        return this;
    }
    public String getSysDiskCategory() {
        return this.sysDiskCategory;
    }

    public ScalingGroupConfig setSysDiskSize(Long sysDiskSize) {
        this.sysDiskSize = sysDiskSize;
        return this;
    }
    public Long getSysDiskSize() {
        return this.sysDiskSize;
    }

    public ScalingGroupConfig setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public static class InstanceTypeList extends TeaModel {
        /**
         * <p>Ecs类型。</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>抢占价格上限,可空。</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        public static InstanceTypeList build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeList self = new InstanceTypeList();
            return TeaModel.build(map, self);
        }

        public InstanceTypeList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public InstanceTypeList setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

    }

    public static class PolicyParam extends TeaModel {
        /**
         * <p>按需实例最小个数。</p>
         */
        @NameInMap("OnDemandBaseCapacity")
        public Integer onDemandBaseCapacity;

        /**
         * <p>按需实例百分比。</p>
         */
        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        public Integer onDemandPercentageAboveBaseCapacity;

        /**
         * <p>抢占实例类型池规模。</p>
         */
        @NameInMap("SpotInstancePools")
        public Integer spotInstancePools;

        /**
         * <p>是否使用按量补偿。</p>
         */
        @NameInMap("SpotInstanceRemedy")
        public Boolean spotInstanceRemedy;

        public static PolicyParam build(java.util.Map<String, ?> map) throws Exception {
            PolicyParam self = new PolicyParam();
            return TeaModel.build(map, self);
        }

        public PolicyParam setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public PolicyParam setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public PolicyParam setSpotInstancePools(Integer spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Integer getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public PolicyParam setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

    }

    public static class MultiAvailablePolicy extends TeaModel {
        /**
         * <p>资源可用性策略(成本优化参数)。</p>
         */
        @NameInMap("PolicyParam")
        public PolicyParam policyParam;

        /**
         * <p>策略类型。</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static MultiAvailablePolicy build(java.util.Map<String, ?> map) throws Exception {
            MultiAvailablePolicy self = new MultiAvailablePolicy();
            return TeaModel.build(map, self);
        }

        public MultiAvailablePolicy setPolicyParam(PolicyParam policyParam) {
            this.policyParam = policyParam;
            return this;
        }
        public PolicyParam getPolicyParam() {
            return this.policyParam;
        }

        public MultiAvailablePolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class NodeOfflinePolicy extends TeaModel {
        /**
         * <p>下线模式,是否为优雅下线。</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>下线超时时间,单位毫秒。</p>
         */
        @NameInMap("TimeoutMs")
        public Long timeoutMs;

        public static NodeOfflinePolicy build(java.util.Map<String, ?> map) throws Exception {
            NodeOfflinePolicy self = new NodeOfflinePolicy();
            return TeaModel.build(map, self);
        }

        public NodeOfflinePolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public NodeOfflinePolicy setTimeoutMs(Long timeoutMs) {
            this.timeoutMs = timeoutMs;
            return this;
        }
        public Long getTimeoutMs() {
            return this.timeoutMs;
        }

    }

    public static class PrivatePoolOptions extends TeaModel {
        /**
         * <p>私有池id。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>实例启动的私有池容量选项。。</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static PrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            PrivatePoolOptions self = new PrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public PrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

}
