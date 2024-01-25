// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestAuthorizationDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public RequestAuthorizationDataResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RequestAuthorizationDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestAuthorizationDataResponseBody self = new RequestAuthorizationDataResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestAuthorizationDataResponseBody setData(RequestAuthorizationDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestAuthorizationDataResponseBodyData getData() {
        return this.data;
    }

    public RequestAuthorizationDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestAuthorizationDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestAuthorizationDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestAuthorizationDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestAuthorizationDataResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static RequestAuthorizationDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestAuthorizationDataResponseBodyData self = new RequestAuthorizationDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestAuthorizationDataResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
