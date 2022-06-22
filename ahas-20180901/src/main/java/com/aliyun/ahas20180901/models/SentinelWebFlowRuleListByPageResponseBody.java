// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleListByPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelWebFlowRuleListByPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelWebFlowRuleListByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleListByPageResponseBody self = new SentinelWebFlowRuleListByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleListByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelWebFlowRuleListByPageResponseBody setData(SentinelWebFlowRuleListByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelWebFlowRuleListByPageResponseBodyData getData() {
        return this.data;
    }

    public SentinelWebFlowRuleListByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelWebFlowRuleListByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelWebFlowRuleListByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelWebFlowRuleListByPageResponseBodyDataDatas extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("burst")
        public Integer burst;

        @NameInMap("controlBehavior")
        public Integer controlBehavior;

        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("fallbackObject")
        public String fallbackObject;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("hasParam")
        public Boolean hasParam;

        @NameInMap("id")
        public Long id;

        @NameInMap("intervalSec")
        public Long intervalSec;

        @NameInMap("maxQueueingTimeoutMs")
        public Integer maxQueueingTimeoutMs;

        @NameInMap("model")
        public Long model;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("paramItem")
        public java.util.Map<String, ?> paramItem;

        @NameInMap("resource")
        public String resource;

        @NameInMap("resourceMode")
        public Integer resourceMode;

        @NameInMap("statIntervalMs")
        public Integer statIntervalMs;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("timeWindow")
        public Integer timeWindow;

        @NameInMap("userId")
        public String userId;

        public static SentinelWebFlowRuleListByPageResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelWebFlowRuleListByPageResponseBodyDataDatas self = new SentinelWebFlowRuleListByPageResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setBurst(Integer burst) {
            this.burst = burst;
            return this;
        }
        public Integer getBurst() {
            return this.burst;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setHasParam(Boolean hasParam) {
            this.hasParam = hasParam;
            return this;
        }
        public Boolean getHasParam() {
            return this.hasParam;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setIntervalSec(Long intervalSec) {
            this.intervalSec = intervalSec;
            return this;
        }
        public Long getIntervalSec() {
            return this.intervalSec;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setMaxQueueingTimeoutMs(Integer maxQueueingTimeoutMs) {
            this.maxQueueingTimeoutMs = maxQueueingTimeoutMs;
            return this;
        }
        public Integer getMaxQueueingTimeoutMs() {
            return this.maxQueueingTimeoutMs;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setModel(Long model) {
            this.model = model;
            return this;
        }
        public Long getModel() {
            return this.model;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setParamItem(java.util.Map<String, ?> paramItem) {
            this.paramItem = paramItem;
            return this;
        }
        public java.util.Map<String, ?> getParamItem() {
            return this.paramItem;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setResourceMode(Integer resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public Integer getResourceMode() {
            return this.resourceMode;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public SentinelWebFlowRuleListByPageResponseBodyDataDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SentinelWebFlowRuleListByPageResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<SentinelWebFlowRuleListByPageResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static SentinelWebFlowRuleListByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelWebFlowRuleListByPageResponseBodyData self = new SentinelWebFlowRuleListByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelWebFlowRuleListByPageResponseBodyData setDatas(java.util.List<SentinelWebFlowRuleListByPageResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelWebFlowRuleListByPageResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelWebFlowRuleListByPageResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelWebFlowRuleListByPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelWebFlowRuleListByPageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelWebFlowRuleListByPageResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
