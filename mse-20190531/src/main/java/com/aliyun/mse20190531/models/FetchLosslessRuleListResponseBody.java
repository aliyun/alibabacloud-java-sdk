// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class FetchLosslessRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FetchLosslessRuleListResponseBodyData data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FetchLosslessRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchLosslessRuleListResponseBody self = new FetchLosslessRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchLosslessRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FetchLosslessRuleListResponseBody setData(FetchLosslessRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchLosslessRuleListResponseBodyData getData() {
        return this.data;
    }

    public FetchLosslessRuleListResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public FetchLosslessRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchLosslessRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchLosslessRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FetchLosslessRuleListResponseBodyDataResults extends TeaModel {
        @NameInMap("Aligned")
        public Boolean aligned;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Count")
        public Long count;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("FuncType")
        public Long funcType;

        @NameInMap("LossLessDetail")
        public Boolean lossLessDetail;

        @NameInMap("Notice")
        public Boolean notice;

        @NameInMap("Related")
        public Boolean related;

        @NameInMap("ShutdownWaitSeconds")
        public Integer shutdownWaitSeconds;

        @NameInMap("WarmupTime")
        public Long warmupTime;

        public static FetchLosslessRuleListResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            FetchLosslessRuleListResponseBodyDataResults self = new FetchLosslessRuleListResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public FetchLosslessRuleListResponseBodyDataResults setAligned(Boolean aligned) {
            this.aligned = aligned;
            return this;
        }
        public Boolean getAligned() {
            return this.aligned;
        }

        public FetchLosslessRuleListResponseBodyDataResults setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public FetchLosslessRuleListResponseBodyDataResults setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public FetchLosslessRuleListResponseBodyDataResults setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public FetchLosslessRuleListResponseBodyDataResults setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public FetchLosslessRuleListResponseBodyDataResults setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public FetchLosslessRuleListResponseBodyDataResults setFuncType(Long funcType) {
            this.funcType = funcType;
            return this;
        }
        public Long getFuncType() {
            return this.funcType;
        }

        public FetchLosslessRuleListResponseBodyDataResults setLossLessDetail(Boolean lossLessDetail) {
            this.lossLessDetail = lossLessDetail;
            return this;
        }
        public Boolean getLossLessDetail() {
            return this.lossLessDetail;
        }

        public FetchLosslessRuleListResponseBodyDataResults setNotice(Boolean notice) {
            this.notice = notice;
            return this;
        }
        public Boolean getNotice() {
            return this.notice;
        }

        public FetchLosslessRuleListResponseBodyDataResults setRelated(Boolean related) {
            this.related = related;
            return this;
        }
        public Boolean getRelated() {
            return this.related;
        }

        public FetchLosslessRuleListResponseBodyDataResults setShutdownWaitSeconds(Integer shutdownWaitSeconds) {
            this.shutdownWaitSeconds = shutdownWaitSeconds;
            return this;
        }
        public Integer getShutdownWaitSeconds() {
            return this.shutdownWaitSeconds;
        }

        public FetchLosslessRuleListResponseBodyDataResults setWarmupTime(Long warmupTime) {
            this.warmupTime = warmupTime;
            return this;
        }
        public Long getWarmupTime() {
            return this.warmupTime;
        }

    }

    public static class FetchLosslessRuleListResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Results")
        public java.util.List<FetchLosslessRuleListResponseBodyDataResults> results;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static FetchLosslessRuleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchLosslessRuleListResponseBodyData self = new FetchLosslessRuleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchLosslessRuleListResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public FetchLosslessRuleListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public FetchLosslessRuleListResponseBodyData setResults(java.util.List<FetchLosslessRuleListResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<FetchLosslessRuleListResponseBodyDataResults> getResults() {
            return this.results;
        }

        public FetchLosslessRuleListResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
