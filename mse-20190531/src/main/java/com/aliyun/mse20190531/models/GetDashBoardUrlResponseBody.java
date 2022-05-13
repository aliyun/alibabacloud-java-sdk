// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetDashBoardUrlResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDashBoardUrlResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDashBoardUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDashBoardUrlResponseBody self = new GetDashBoardUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDashBoardUrlResponseBody setData(GetDashBoardUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDashBoardUrlResponseBodyData getData() {
        return this.data;
    }

    public GetDashBoardUrlResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDashBoardUrlResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetDashBoardUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDashBoardUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDashBoardUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDashBoardUrlResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("UrlMap")
        public java.util.Map<String, ?> urlMap;

        public static GetDashBoardUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDashBoardUrlResponseBodyData self = new GetDashBoardUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDashBoardUrlResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDashBoardUrlResponseBodyData setUrlMap(java.util.Map<String, ?> urlMap) {
            this.urlMap = urlMap;
            return this;
        }
        public java.util.Map<String, ?> getUrlMap() {
            return this.urlMap;
        }

    }

}
