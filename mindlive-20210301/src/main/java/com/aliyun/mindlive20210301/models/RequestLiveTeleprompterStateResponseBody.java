// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestLiveTeleprompterStateResponseBody extends TeaModel {
    @NameInMap("Data")
    public RequestLiveTeleprompterStateResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RequestLiveTeleprompterStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestLiveTeleprompterStateResponseBody self = new RequestLiveTeleprompterStateResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestLiveTeleprompterStateResponseBody setData(RequestLiveTeleprompterStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestLiveTeleprompterStateResponseBodyData getData() {
        return this.data;
    }

    public RequestLiveTeleprompterStateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestLiveTeleprompterStateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestLiveTeleprompterStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestLiveTeleprompterStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestLiveTeleprompterStateResponseBodyData extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        public static RequestLiveTeleprompterStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestLiveTeleprompterStateResponseBodyData self = new RequestLiveTeleprompterStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestLiveTeleprompterStateResponseBodyData setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

    }

}
