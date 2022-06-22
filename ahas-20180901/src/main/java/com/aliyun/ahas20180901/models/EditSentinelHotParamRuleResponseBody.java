// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EditSentinelHotParamRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EditSentinelHotParamRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EditSentinelHotParamRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditSentinelHotParamRuleResponseBody self = new EditSentinelHotParamRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EditSentinelHotParamRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EditSentinelHotParamRuleResponseBody setData(EditSentinelHotParamRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EditSentinelHotParamRuleResponseBodyData getData() {
        return this.data;
    }

    public EditSentinelHotParamRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EditSentinelHotParamRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditSentinelHotParamRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EditSentinelHotParamRuleResponseBodyDataParamFlowItemList extends TeaModel {
        @NameInMap("classType")
        public String classType;

        @NameInMap("count")
        public Integer count;

        @NameInMap("object")
        public String object;

        public static EditSentinelHotParamRuleResponseBodyDataParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            EditSentinelHotParamRuleResponseBodyDataParamFlowItemList self = new EditSentinelHotParamRuleResponseBodyDataParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public EditSentinelHotParamRuleResponseBodyDataParamFlowItemList setClassType(String classType) {
            this.classType = classType;
            return this;
        }
        public String getClassType() {
            return this.classType;
        }

        public EditSentinelHotParamRuleResponseBodyDataParamFlowItemList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public EditSentinelHotParamRuleResponseBodyDataParamFlowItemList setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class EditSentinelHotParamRuleResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("burstCount")
        public Integer burstCount;

        @NameInMap("clusterFailFallback")
        public Boolean clusterFailFallback;

        @NameInMap("clusterMode")
        public Boolean clusterMode;

        @NameInMap("clusterThresholdType")
        public Integer clusterThresholdType;

        @NameInMap("controlBehavior")
        public Integer controlBehavior;

        @NameInMap("count")
        public Float count;

        @NameInMap("durationInSec")
        public Long durationInSec;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        @NameInMap("limitApp")
        public String limitApp;

        @NameInMap("maxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("paramFlowItemList")
        public java.util.List<EditSentinelHotParamRuleResponseBodyDataParamFlowItemList> paramFlowItemList;

        @NameInMap("paramIdx")
        public Integer paramIdx;

        @NameInMap("resource")
        public String resource;

        @NameInMap("sampleCount")
        public Integer sampleCount;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("userId")
        public String userId;

        @NameInMap("windowIntervalMs")
        public Integer windowIntervalMs;

        public static EditSentinelHotParamRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EditSentinelHotParamRuleResponseBodyData self = new EditSentinelHotParamRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EditSentinelHotParamRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public EditSentinelHotParamRuleResponseBodyData setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public EditSentinelHotParamRuleResponseBodyData setClusterFailFallback(Boolean clusterFailFallback) {
            this.clusterFailFallback = clusterFailFallback;
            return this;
        }
        public Boolean getClusterFailFallback() {
            return this.clusterFailFallback;
        }

        public EditSentinelHotParamRuleResponseBodyData setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public EditSentinelHotParamRuleResponseBodyData setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public EditSentinelHotParamRuleResponseBodyData setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public EditSentinelHotParamRuleResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public EditSentinelHotParamRuleResponseBodyData setDurationInSec(Long durationInSec) {
            this.durationInSec = durationInSec;
            return this;
        }
        public Long getDurationInSec() {
            return this.durationInSec;
        }

        public EditSentinelHotParamRuleResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public EditSentinelHotParamRuleResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public EditSentinelHotParamRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public EditSentinelHotParamRuleResponseBodyData setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public EditSentinelHotParamRuleResponseBodyData setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public EditSentinelHotParamRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public EditSentinelHotParamRuleResponseBodyData setParamFlowItemList(java.util.List<EditSentinelHotParamRuleResponseBodyDataParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<EditSentinelHotParamRuleResponseBodyDataParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        public EditSentinelHotParamRuleResponseBodyData setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public EditSentinelHotParamRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public EditSentinelHotParamRuleResponseBodyData setSampleCount(Integer sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Integer getSampleCount() {
            return this.sampleCount;
        }

        public EditSentinelHotParamRuleResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public EditSentinelHotParamRuleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public EditSentinelHotParamRuleResponseBodyData setWindowIntervalMs(Integer windowIntervalMs) {
            this.windowIntervalMs = windowIntervalMs;
            return this;
        }
        public Integer getWindowIntervalMs() {
            return this.windowIntervalMs;
        }

    }

}
