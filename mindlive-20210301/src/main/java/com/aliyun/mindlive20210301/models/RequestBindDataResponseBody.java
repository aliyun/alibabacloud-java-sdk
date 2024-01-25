// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestBindDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public RequestBindDataResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RequestBindDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestBindDataResponseBody self = new RequestBindDataResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestBindDataResponseBody setData(RequestBindDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestBindDataResponseBodyData getData() {
        return this.data;
    }

    public RequestBindDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestBindDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestBindDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestBindDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestBindDataResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("MaxKeepSeconds")
        public Integer maxKeepSeconds;

        @NameInMap("ShortUrl")
        public String shortUrl;

        @NameInMap("Url")
        public String url;

        public static RequestBindDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestBindDataResponseBodyData self = new RequestBindDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestBindDataResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RequestBindDataResponseBodyData setMaxKeepSeconds(Integer maxKeepSeconds) {
            this.maxKeepSeconds = maxKeepSeconds;
            return this;
        }
        public Integer getMaxKeepSeconds() {
            return this.maxKeepSeconds;
        }

        public RequestBindDataResponseBodyData setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public RequestBindDataResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
