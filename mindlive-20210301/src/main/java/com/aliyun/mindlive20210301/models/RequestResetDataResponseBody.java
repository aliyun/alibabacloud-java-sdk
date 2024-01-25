// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestResetDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public RequestResetDataResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RequestResetDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestResetDataResponseBody self = new RequestResetDataResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestResetDataResponseBody setData(RequestResetDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestResetDataResponseBodyData getData() {
        return this.data;
    }

    public RequestResetDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestResetDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestResetDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestResetDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestResetDataResponseBodyData extends TeaModel {
        @NameInMap("FullUrl")
        public String fullUrl;

        @NameInMap("Url")
        public String url;

        public static RequestResetDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestResetDataResponseBodyData self = new RequestResetDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestResetDataResponseBodyData setFullUrl(String fullUrl) {
            this.fullUrl = fullUrl;
            return this;
        }
        public String getFullUrl() {
            return this.fullUrl;
        }

        public RequestResetDataResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
