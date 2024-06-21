// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetLosslessRuleByAppResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetLosslessRuleByAppResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLosslessRuleByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLosslessRuleByAppResponseBody self = new GetLosslessRuleByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLosslessRuleByAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLosslessRuleByAppResponseBody setData(GetLosslessRuleByAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLosslessRuleByAppResponseBodyData getData() {
        return this.data;
    }

    public GetLosslessRuleByAppResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLosslessRuleByAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLosslessRuleByAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLosslessRuleByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLosslessRuleByAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLosslessRuleByAppResponseBodyData extends TeaModel {
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
         * <p>hkhon1po62@24810bf4364a***</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>true</p>
         */
        @NameInMap("LossLessDetail")
        public Boolean lossLessDetail;

        /**
         * <p>Indicates whether notification is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>120</p>
         */
        @NameInMap("WarmupTime")
        public Integer warmupTime;

        public static GetLosslessRuleByAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLosslessRuleByAppResponseBodyData self = new GetLosslessRuleByAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLosslessRuleByAppResponseBodyData setAligned(Boolean aligned) {
            this.aligned = aligned;
            return this;
        }
        public Boolean getAligned() {
            return this.aligned;
        }

        public GetLosslessRuleByAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetLosslessRuleByAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLosslessRuleByAppResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetLosslessRuleByAppResponseBodyData setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public GetLosslessRuleByAppResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLosslessRuleByAppResponseBodyData setFuncType(Integer funcType) {
            this.funcType = funcType;
            return this;
        }
        public Integer getFuncType() {
            return this.funcType;
        }

        public GetLosslessRuleByAppResponseBodyData setLossLessDetail(Boolean lossLessDetail) {
            this.lossLessDetail = lossLessDetail;
            return this;
        }
        public Boolean getLossLessDetail() {
            return this.lossLessDetail;
        }

        public GetLosslessRuleByAppResponseBodyData setNotice(Boolean notice) {
            this.notice = notice;
            return this;
        }
        public Boolean getNotice() {
            return this.notice;
        }

        public GetLosslessRuleByAppResponseBodyData setRelated(Boolean related) {
            this.related = related;
            return this;
        }
        public Boolean getRelated() {
            return this.related;
        }

        public GetLosslessRuleByAppResponseBodyData setWarmupTime(Integer warmupTime) {
            this.warmupTime = warmupTime;
            return this;
        }
        public Integer getWarmupTime() {
            return this.warmupTime;
        }

    }

}
