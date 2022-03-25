// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class FindRegionResponseBody extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("AsyncToken")
    public String asyncToken;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public Float errorMsg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public FindRegionResponseBodyResultObj resultObj;

    @NameInMap("Retry")
    public Boolean retry;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static FindRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindRegionResponseBody self = new FindRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public FindRegionResponseBody setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public FindRegionResponseBody setAsyncToken(String asyncToken) {
        this.asyncToken = asyncToken;
        return this;
    }
    public String getAsyncToken() {
        return this.asyncToken;
    }

    public FindRegionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FindRegionResponseBody setErrorMsg(Float errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public Float getErrorMsg() {
        return this.errorMsg;
    }

    public FindRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindRegionResponseBody setResultObj(FindRegionResponseBodyResultObj resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public FindRegionResponseBodyResultObj getResultObj() {
        return this.resultObj;
    }

    public FindRegionResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public FindRegionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FindRegionResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FindRegionResponseBodyResultObj extends TeaModel {
        @NameInMap("RegionList")
        public java.util.List<java.util.Map<String, ?>> regionList;

        public static FindRegionResponseBodyResultObj build(java.util.Map<String, ?> map) throws Exception {
            FindRegionResponseBodyResultObj self = new FindRegionResponseBodyResultObj();
            return TeaModel.build(map, self);
        }

        public FindRegionResponseBodyResultObj setRegionList(java.util.List<java.util.Map<String, ?>> regionList) {
            this.regionList = regionList;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRegionList() {
            return this.regionList;
        }

    }

}
