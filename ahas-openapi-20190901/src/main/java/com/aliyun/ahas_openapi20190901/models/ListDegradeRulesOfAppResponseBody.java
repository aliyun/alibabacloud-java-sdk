// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListDegradeRulesOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDegradeRulesOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDegradeRulesOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDegradeRulesOfAppResponseBody self = new ListDegradeRulesOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDegradeRulesOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDegradeRulesOfAppResponseBody setData(ListDegradeRulesOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDegradeRulesOfAppResponseBodyData getData() {
        return this.data;
    }

    public ListDegradeRulesOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDegradeRulesOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDegradeRulesOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDegradeRulesOfAppResponseBodyDataDatas extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("HalfOpenBaseAmountPerStep")
        public Integer halfOpenBaseAmountPerStep;

        @NameInMap("HalfOpenRecoveryStepNum")
        public Integer halfOpenRecoveryStepNum;

        @NameInMap("MinRequestAmount")
        public Integer minRequestAmount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RecoveryTimeoutMs")
        public Integer recoveryTimeoutMs;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("SlowRtMs")
        public Integer slowRtMs;

        @NameInMap("StatDurationMs")
        public Integer statDurationMs;

        @NameInMap("Strategy")
        public Integer strategy;

        @NameInMap("Threshold")
        public Float threshold;

        public static ListDegradeRulesOfAppResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeRulesOfAppResponseBodyDataDatas self = new ListDegradeRulesOfAppResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setHalfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setHalfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setMinRequestAmount(Integer minRequestAmount) {
            this.minRequestAmount = minRequestAmount;
            return this;
        }
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setRecoveryTimeoutMs(Integer recoveryTimeoutMs) {
            this.recoveryTimeoutMs = recoveryTimeoutMs;
            return this;
        }
        public Integer getRecoveryTimeoutMs() {
            return this.recoveryTimeoutMs;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setSlowRtMs(Integer slowRtMs) {
            this.slowRtMs = slowRtMs;
            return this;
        }
        public Integer getSlowRtMs() {
            return this.slowRtMs;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setStatDurationMs(Integer statDurationMs) {
            this.statDurationMs = statDurationMs;
            return this;
        }
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public ListDegradeRulesOfAppResponseBodyDataDatas setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListDegradeRulesOfAppResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<ListDegradeRulesOfAppResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListDegradeRulesOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeRulesOfAppResponseBodyData self = new ListDegradeRulesOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDegradeRulesOfAppResponseBodyData setDatas(java.util.List<ListDegradeRulesOfAppResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<ListDegradeRulesOfAppResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public ListDegradeRulesOfAppResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListDegradeRulesOfAppResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDegradeRulesOfAppResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDegradeRulesOfAppResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
