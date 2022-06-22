// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleListByPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelFlowRuleListByPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelFlowRuleListByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleListByPageResponseBody self = new SentinelFlowRuleListByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleListByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelFlowRuleListByPageResponseBody setData(SentinelFlowRuleListByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelFlowRuleListByPageResponseBodyData getData() {
        return this.data;
    }

    public SentinelFlowRuleListByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelFlowRuleListByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelFlowRuleListByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelFlowRuleListByPageResponseBodyDataDatas extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("autoAdjustFallbackThresholdEnabled")
        public Boolean autoAdjustFallbackThresholdEnabled;

        @NameInMap("clusterFallbackThreshold")
        public Integer clusterFallbackThreshold;

        @NameInMap("clusterMode")
        public Boolean clusterMode;

        @NameInMap("clusterRequestMode")
        public Integer clusterRequestMode;

        @NameInMap("clusterThresholdType")
        public Integer clusterThresholdType;

        @NameInMap("controlBehavior")
        public Integer controlBehavior;

        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("estimatedMaxClusterQps")
        public Float estimatedMaxClusterQps;

        @NameInMap("fallbackObject")
        public String fallbackObject;

        @NameInMap("fallbackThresholdAdjustMargin")
        public Integer fallbackThresholdAdjustMargin;

        @NameInMap("fallbackToLocalWhenFail")
        public Boolean fallbackToLocalWhenFail;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        @NameInMap("limitApp")
        public String limitApp;

        @NameInMap("maxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("model")
        public Long model;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("refResource")
        public String refResource;

        @NameInMap("resource")
        public String resource;

        @NameInMap("sampleCount")
        public Integer sampleCount;

        @NameInMap("strategy")
        public Integer strategy;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("userId")
        public String userId;

        @NameInMap("warmUpPeriodSec")
        public Integer warmUpPeriodSec;

        @NameInMap("windowIntervalMs")
        public Integer windowIntervalMs;

        public static SentinelFlowRuleListByPageResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelFlowRuleListByPageResponseBodyDataDatas self = new SentinelFlowRuleListByPageResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setAutoAdjustFallbackThresholdEnabled(Boolean autoAdjustFallbackThresholdEnabled) {
            this.autoAdjustFallbackThresholdEnabled = autoAdjustFallbackThresholdEnabled;
            return this;
        }
        public Boolean getAutoAdjustFallbackThresholdEnabled() {
            return this.autoAdjustFallbackThresholdEnabled;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
            this.clusterFallbackThreshold = clusterFallbackThreshold;
            return this;
        }
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setClusterRequestMode(Integer clusterRequestMode) {
            this.clusterRequestMode = clusterRequestMode;
            return this;
        }
        public Integer getClusterRequestMode() {
            return this.clusterRequestMode;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setEstimatedMaxClusterQps(Float estimatedMaxClusterQps) {
            this.estimatedMaxClusterQps = estimatedMaxClusterQps;
            return this;
        }
        public Float getEstimatedMaxClusterQps() {
            return this.estimatedMaxClusterQps;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setFallbackThresholdAdjustMargin(Integer fallbackThresholdAdjustMargin) {
            this.fallbackThresholdAdjustMargin = fallbackThresholdAdjustMargin;
            return this;
        }
        public Integer getFallbackThresholdAdjustMargin() {
            return this.fallbackThresholdAdjustMargin;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setFallbackToLocalWhenFail(Boolean fallbackToLocalWhenFail) {
            this.fallbackToLocalWhenFail = fallbackToLocalWhenFail;
            return this;
        }
        public Boolean getFallbackToLocalWhenFail() {
            return this.fallbackToLocalWhenFail;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setModel(Long model) {
            this.model = model;
            return this;
        }
        public Long getModel() {
            return this.model;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setSampleCount(Integer sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Integer getSampleCount() {
            return this.sampleCount;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setWarmUpPeriodSec(Integer warmUpPeriodSec) {
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

        public SentinelFlowRuleListByPageResponseBodyDataDatas setWindowIntervalMs(Integer windowIntervalMs) {
            this.windowIntervalMs = windowIntervalMs;
            return this;
        }
        public Integer getWindowIntervalMs() {
            return this.windowIntervalMs;
        }

    }

    public static class SentinelFlowRuleListByPageResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<SentinelFlowRuleListByPageResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static SentinelFlowRuleListByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelFlowRuleListByPageResponseBodyData self = new SentinelFlowRuleListByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelFlowRuleListByPageResponseBodyData setDatas(java.util.List<SentinelFlowRuleListByPageResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelFlowRuleListByPageResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelFlowRuleListByPageResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelFlowRuleListByPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelFlowRuleListByPageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelFlowRuleListByPageResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
