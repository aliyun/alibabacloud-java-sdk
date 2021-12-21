// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListFlowRulesOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListFlowRulesOfResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListFlowRulesOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRulesOfResourceResponseBody self = new ListFlowRulesOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowRulesOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlowRulesOfResourceResponseBody setData(ListFlowRulesOfResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlowRulesOfResourceResponseBodyData getData() {
        return this.data;
    }

    public ListFlowRulesOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlowRulesOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowRulesOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlowRulesOfResourceResponseBodyDataDatas extends TeaModel {
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

        public static ListFlowRulesOfResourceResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ListFlowRulesOfResourceResponseBodyDataDatas self = new ListFlowRulesOfResourceResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setClusterEstimatedMaxQps(Float clusterEstimatedMaxQps) {
            this.clusterEstimatedMaxQps = clusterEstimatedMaxQps;
            return this;
        }
        public Float getClusterEstimatedMaxQps() {
            return this.clusterEstimatedMaxQps;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setClusterFallbackStrategy(Integer clusterFallbackStrategy) {
            this.clusterFallbackStrategy = clusterFallbackStrategy;
            return this;
        }
        public Integer getClusterFallbackStrategy() {
            return this.clusterFallbackStrategy;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setClusterFallbackThreshold(Integer clusterFallbackThreshold) {
            this.clusterFallbackThreshold = clusterFallbackThreshold;
            return this;
        }
        public Integer getClusterFallbackThreshold() {
            return this.clusterFallbackThreshold;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setClusterMode(Boolean clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public Boolean getClusterMode() {
            return this.clusterMode;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setClusterThresholdType(Integer clusterThresholdType) {
            this.clusterThresholdType = clusterThresholdType;
            return this;
        }
        public Integer getClusterThresholdType() {
            return this.clusterThresholdType;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListFlowRulesOfResourceResponseBodyDataDatas setWarmUpPeriodSec(Integer warmUpPeriodSec) {
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }
        public Integer getWarmUpPeriodSec() {
            return this.warmUpPeriodSec;
        }

    }

    public static class ListFlowRulesOfResourceResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<ListFlowRulesOfResourceResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListFlowRulesOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlowRulesOfResourceResponseBodyData self = new ListFlowRulesOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlowRulesOfResourceResponseBodyData setDatas(java.util.List<ListFlowRulesOfResourceResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<ListFlowRulesOfResourceResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public ListFlowRulesOfResourceResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListFlowRulesOfResourceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFlowRulesOfResourceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFlowRulesOfResourceResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
