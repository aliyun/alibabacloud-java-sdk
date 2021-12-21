// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListFlowRulesOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListFlowRulesOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListFlowRulesOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRulesOfAppResponseBody self = new ListFlowRulesOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowRulesOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlowRulesOfAppResponseBody setData(ListFlowRulesOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlowRulesOfAppResponseBodyData getData() {
        return this.data;
    }

    public ListFlowRulesOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlowRulesOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowRulesOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlowRulesOfAppResponseBodyDataDatas extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterEstimatedMaxQps")
        public Float clusterEstimatedMaxQps;

        @NameInMap("ClusterFallbackStrategy")
        public Integer clusterFallbackStrategy;

        @NameInMap("ClusterFallbackThreshold")
        public Integer clusterFallbackThreshold;

        @NameInMap("ClusterMode")
        public Boolean clusterMode;

        @NameInMap("ClusterThresholdType")
        public Integer clusterThresholdType;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("LimitOrigin")
        public String limitOrigin;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RefResource")
        public String refResource;

        @NameInMap("RelationStrategy")
        public Integer relationStrategy;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("StatDurationMs")
        public Integer statDurationMs;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("WarmUpPeriodSec")
        public Integer warmUpPeriodSec;

        public static ListFlowRulesOfAppResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ListFlowRulesOfAppResponseBodyDataDatas self = new ListFlowRulesOfAppResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setClusterEstimatedMaxQps(Float clusterEstimatedMaxQps) {
            this.clusterEstimatedMaxQps = clusterEstimatedMaxQps;
            return this;
        }
        public Float getClusterEstimatedMaxQps() {
            return this.clusterEstimatedMaxQps;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setClusterFallbackStrategy(Integer clusterFallbackStrategy) {
            this.clusterFallbackStrategy = clusterFallbackStrategy;
            return this;
        }
        public Integer getClusterFallbackStrategy() {
            return this.clusterFallbackStrategy;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
            this.clusterFallbackThreshold = clusterFallbackThreshold;
            return this;
        }
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListFlowRulesOfAppResponseBodyDataDatas setWarmUpPeriodSec(Integer warmUpPeriodSec) {
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

    }

    public static class ListFlowRulesOfAppResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<ListFlowRulesOfAppResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListFlowRulesOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlowRulesOfAppResponseBodyData self = new ListFlowRulesOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlowRulesOfAppResponseBodyData setDatas(java.util.List<ListFlowRulesOfAppResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<ListFlowRulesOfAppResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public ListFlowRulesOfAppResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListFlowRulesOfAppResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFlowRulesOfAppResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFlowRulesOfAppResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
