// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetLosslessRuleByAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetLosslessRuleByAppResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Aligned")
        public Boolean aligned;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("DelayTime")
        public Integer delayTime;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("FuncType")
        public Integer funcType;

        @NameInMap("LossLessDetail")
        public Boolean lossLessDetail;

        @NameInMap("Notice")
        public Boolean notice;

        @NameInMap("Related")
        public Boolean related;

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
