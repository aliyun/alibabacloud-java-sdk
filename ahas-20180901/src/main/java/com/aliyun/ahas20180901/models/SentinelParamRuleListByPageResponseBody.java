// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelParamRuleListByPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelParamRuleListByPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelParamRuleListByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelParamRuleListByPageResponseBody self = new SentinelParamRuleListByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelParamRuleListByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelParamRuleListByPageResponseBody setData(SentinelParamRuleListByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelParamRuleListByPageResponseBodyData getData() {
        return this.data;
    }

    public SentinelParamRuleListByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelParamRuleListByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelParamRuleListByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList extends TeaModel {
        @NameInMap("classType")
        public String classType;

        @NameInMap("clusterFallbackCount")
        public Float clusterFallbackCount;

        @NameInMap("count")
        public Float count;

        @NameInMap("object")
        public String object;

        public static SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList self = new SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList setClassType(String classType) {
            this.classType = classType;
            return this;
        }
        public String getClassType() {
            return this.classType;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList setClusterFallbackCount(Float clusterFallbackCount) {
            this.clusterFallbackCount = clusterFallbackCount;
            return this;
        }
        public Float getClusterFallbackCount() {
            return this.clusterFallbackCount;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SentinelParamRuleListByPageResponseBodyDataDatas extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("burstCount")
        public Integer burstCount;

        @NameInMap("clusterFailFallback")
        public Boolean clusterFailFallback;

        @NameInMap("clusterFallbackThreshold")
        public Integer clusterFallbackThreshold;

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

        @NameInMap("estimatedMaxClusterQps")
        public Float estimatedMaxClusterQps;

        @NameInMap("fallbackObject")
        public String fallbackObject;

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

        @NameInMap("paramFlowItemList")
        public java.util.List<SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList> paramFlowItemList;

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

        public static SentinelParamRuleListByPageResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelParamRuleListByPageResponseBodyDataDatas self = new SentinelParamRuleListByPageResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setClusterFailFallback(Boolean clusterFailFallback) {
            this.clusterFailFallback = clusterFailFallback;
            return this;
        }
        public Boolean getClusterFailFallback() {
            return this.clusterFailFallback;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
            this.clusterFallbackThreshold = clusterFallbackThreshold;
            return this;
        }
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setDurationInSec(Long durationInSec) {
            this.durationInSec = durationInSec;
            return this;
        }
        public Long getDurationInSec() {
            return this.durationInSec;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setEstimatedMaxClusterQps(Float estimatedMaxClusterQps) {
            this.estimatedMaxClusterQps = estimatedMaxClusterQps;
            return this;
        }
        public Float getEstimatedMaxClusterQps() {
            return this.estimatedMaxClusterQps;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setModel(Long model) {
            this.model = model;
            return this;
        }
        public Long getModel() {
            return this.model;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setParamFlowItemList(java.util.List<SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<SentinelParamRuleListByPageResponseBodyDataDatasParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setSampleCount(Integer sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Integer getSampleCount() {
            return this.sampleCount;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelParamRuleListByPageResponseBodyDataDatas setWindowIntervalMs(Integer windowIntervalMs) {
            this.windowIntervalMs = windowIntervalMs;
            return this;
        }
        public Integer getWindowIntervalMs() {
            return this.windowIntervalMs;
        }

    }

    public static class SentinelParamRuleListByPageResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<SentinelParamRuleListByPageResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static SentinelParamRuleListByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelParamRuleListByPageResponseBodyData self = new SentinelParamRuleListByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelParamRuleListByPageResponseBodyData setDatas(java.util.List<SentinelParamRuleListByPageResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelParamRuleListByPageResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelParamRuleListByPageResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelParamRuleListByPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelParamRuleListByPageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelParamRuleListByPageResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
