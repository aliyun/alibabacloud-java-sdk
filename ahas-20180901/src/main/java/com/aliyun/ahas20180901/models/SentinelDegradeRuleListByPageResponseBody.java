// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleListByPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelDegradeRuleListByPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelDegradeRuleListByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleListByPageResponseBody self = new SentinelDegradeRuleListByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleListByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelDegradeRuleListByPageResponseBody setData(SentinelDegradeRuleListByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelDegradeRuleListByPageResponseBodyData getData() {
        return this.data;
    }

    public SentinelDegradeRuleListByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelDegradeRuleListByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelDegradeRuleListByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelDegradeRuleListByPageResponseBodyDataDatas extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("fallbackObject")
        public String fallbackObject;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("halfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        @NameInMap("halfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        @NameInMap("id")
        public Long id;

        @NameInMap("limitApp")
        public String limitApp;

        @NameInMap("minRequestAmount")
        public Integer minRequestAmount;

        @NameInMap("model")
        public Long model;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("resource")
        public String resource;

        @NameInMap("slowRatioThreshold")
        public Float slowRatioThreshold;

        @NameInMap("statIntervalMs")
        public Integer statIntervalMs;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("timeWindow")
        public Integer timeWindow;

        @NameInMap("userId")
        public String userId;

        public static SentinelDegradeRuleListByPageResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelDegradeRuleListByPageResponseBodyDataDatas self = new SentinelDegradeRuleListByPageResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setLimitApp(String limitApp) {
            this.limitApp = limitApp;
            return this;
        }
        public String getLimitApp() {
            return this.limitApp;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setModel(Long model) {
            this.model = model;
            return this;
        }
        public Long getModel() {
            return this.model;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setSlowRatioThreshold(Float slowRatioThreshold) {
            this.slowRatioThreshold = slowRatioThreshold;
            return this;
        }
        public Float getSlowRatioThreshold() {
            return this.slowRatioThreshold;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setStatIntervalMs(Integer statIntervalMs) {
            this.statIntervalMs = statIntervalMs;
            return this;
        }
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setTimeWindow(Integer timeWindow) {
            this.timeWindow = timeWindow;
            return this;
        }
        public Integer getTimeWindow() {
            return this.timeWindow;
        }

        public SentinelDegradeRuleListByPageResponseBodyDataDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SentinelDegradeRuleListByPageResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<SentinelDegradeRuleListByPageResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static SentinelDegradeRuleListByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelDegradeRuleListByPageResponseBodyData self = new SentinelDegradeRuleListByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelDegradeRuleListByPageResponseBodyData setDatas(java.util.List<SentinelDegradeRuleListByPageResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelDegradeRuleListByPageResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelDegradeRuleListByPageResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelDegradeRuleListByPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelDegradeRuleListByPageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelDegradeRuleListByPageResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
