// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody self = new SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody setData(java.util.List<SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData> getData() {
        return this.data;
    }

    public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig extends TeaModel {
        @NameInMap("FallbackToLocalWhenFail")
        public Boolean fallbackToLocalWhenFail;

        @NameInMap("FlowId")
        public Long flowId;

        @NameInMap("SampleCount")
        public Integer sampleCount;

        @NameInMap("ThresholdType")
        public Integer thresholdType;

        @NameInMap("WindowIntervalMs")
        public Long windowIntervalMs;

        public static SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig self = new SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig();
            return TeaModel.build(map, self);
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig setFallbackToLocalWhenFail(Boolean fallbackToLocalWhenFail) {
            this.fallbackToLocalWhenFail = fallbackToLocalWhenFail;
            return this;
        }
        public Boolean getFallbackToLocalWhenFail() {
            return this.fallbackToLocalWhenFail;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig setFlowId(Long flowId) {
            this.flowId = flowId;
            return this;
        }
        public Long getFlowId() {
            return this.flowId;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig setSampleCount(Integer sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Integer getSampleCount() {
            return this.sampleCount;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig setThresholdType(Integer thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public Integer getThresholdType() {
            return this.thresholdType;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig setWindowIntervalMs(Long windowIntervalMs) {
            this.windowIntervalMs = windowIntervalMs;
            return this;
        }
        public Long getWindowIntervalMs() {
            return this.windowIntervalMs;
        }

    }

    public static class SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList extends TeaModel {
        @NameInMap("ClassType")
        public String classType;

        @NameInMap("ClusterFallbackCount")
        public Float clusterFallbackCount;

        @NameInMap("Count")
        public Float count;

        @NameInMap("Object")
        public String object;

        public static SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList self = new SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList setClassType(String classType) {
            this.classType = classType;
            return this;
        }
        public String getClassType() {
            return this.classType;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList setClusterFallbackCount(Float clusterFallbackCount) {
            this.clusterFallbackCount = clusterFallbackCount;
            return this;
        }
        public Float getClusterFallbackCount() {
            return this.clusterFallbackCount;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData extends TeaModel {
        @NameInMap("BurstCount")
        public Integer burstCount;

        @NameInMap("ClusterConfig")
        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig clusterConfig;

        @NameInMap("ClusterMode")
        public Boolean clusterMode;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("Count")
        public Float count;

        @NameInMap("DurationInSec")
        public Long durationInSec;

        @NameInMap("Grade")
        public Integer grade;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("ParamFlowItemList")
        public java.util.List<SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList> paramFlowItemList;

        @NameInMap("ParamIdx")
        public Integer paramIdx;

        @NameInMap("Resource")
        public String resource;

        public static SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData self = new SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setClusterConfig(SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }
        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataClusterConfig getClusterConfig() {
            return this.clusterConfig;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setDurationInSec(Long durationInSec) {
            this.durationInSec = durationInSec;
            return this;
        }
        public Long getDurationInSec() {
            return this.durationInSec;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setParamFlowItemList(java.util.List<SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyDataParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public SentinelClusterV2AliyunAgwGetAllFlowRulesForPushResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
