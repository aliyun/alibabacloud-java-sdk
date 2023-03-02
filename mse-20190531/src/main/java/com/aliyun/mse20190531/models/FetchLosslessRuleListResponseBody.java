// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class FetchLosslessRuleListResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response.</p>
     */
    @NameInMap("Data")
    public FetchLosslessRuleListResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
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
        /**
         * <p>Indicates whether delayed registration is enabled.</p>
         */
        @NameInMap("Aligned")
        public Boolean aligned;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of instances.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The registration latency.</p>
         */
        @NameInMap("DelayTime")
        public Long delayTime;

        /**
         * <p>The status. Valid values:</p>
         * <br>
         * <p>*   `true`: enabled.</p>
         * <p>*   `false`: disabled.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The slope of the prefetching curve.</p>
         */
        @NameInMap("FuncType")
        public Long funcType;

        /**
         * <p>Indicates whether the graceful start and shutdown feature is enabled.</p>
         */
        @NameInMap("LossLessDetail")
        public Boolean lossLessDetail;

        /**
         * <p>Indicates whether notification is enabled.</p>
         */
        @NameInMap("Notice")
        public Boolean notice;

        /**
         * <p>Indicates whether service prefetching is associated.</p>
         */
        @NameInMap("Related")
        public Boolean related;

        /**
         * <p>The wait time for application shutdown.</p>
         */
        @NameInMap("ShutdownWaitSeconds")
        public Integer shutdownWaitSeconds;

        /**
         * <p>The prefetching duration.</p>
         */
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
        /**
         * <p>The number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The data returned.</p>
         */
        @NameInMap("Results")
        public java.util.List<FetchLosslessRuleListResponseBodyDataResults> results;

        /**
         * <p>The total number of entries returned.</p>
         */
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
