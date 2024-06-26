// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class FetchLosslessRuleListResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public FetchLosslessRuleListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>56D9E600-6348-4260-B35F-583413F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FetchLosslessRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchLosslessRuleListResponseBody self = new FetchLosslessRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchLosslessRuleListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FetchLosslessRuleListResponseBody setData(FetchLosslessRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchLosslessRuleListResponseBodyData getData() {
        return this.data;
    }

    public FetchLosslessRuleListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FetchLosslessRuleListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
         * <p>Indicates whether service registration is complete before readiness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Aligned")
        public Boolean aligned;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1po62@24810bf4364aea1</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>echo-demo</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The registration latency. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DelayTime")
        public Integer delayTime;

        /**
         * <p>Indicates whether graceful start is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enabled</li>
         * <li><code>false</code>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The slope of the prefetching curve.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FuncType")
        public Integer funcType;

        /**
         * <p>Indicates whether online and offline processing details are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LossLessDetail")
        public Boolean lossLessDetail;

        /**
         * <p>Indicates whether notification is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Notice")
        public Boolean notice;

        /**
         * <p>Indicates whether service prefetching is complete before readiness probe.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Related")
        public Boolean related;

        /**
         * <p>The prefetching duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("WarmupTime")
        public Integer warmupTime;

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

        public FetchLosslessRuleListResponseBodyDataResults setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public FetchLosslessRuleListResponseBodyDataResults setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public FetchLosslessRuleListResponseBodyDataResults setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public FetchLosslessRuleListResponseBodyDataResults setFuncType(Integer funcType) {
            this.funcType = funcType;
            return this;
        }
        public Integer getFuncType() {
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

        public FetchLosslessRuleListResponseBodyDataResults setWarmupTime(Integer warmupTime) {
            this.warmupTime = warmupTime;
            return this;
        }
        public Integer getWarmupTime() {
            return this.warmupTime;
        }

    }

    public static class FetchLosslessRuleListResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned data.</p>
         */
        @NameInMap("Results")
        public java.util.List<FetchLosslessRuleListResponseBodyDataResults> results;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static FetchLosslessRuleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchLosslessRuleListResponseBodyData self = new FetchLosslessRuleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchLosslessRuleListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public FetchLosslessRuleListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public FetchLosslessRuleListResponseBodyData setResults(java.util.List<FetchLosslessRuleListResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<FetchLosslessRuleListResponseBodyDataResults> getResults() {
            return this.results;
        }

        public FetchLosslessRuleListResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
