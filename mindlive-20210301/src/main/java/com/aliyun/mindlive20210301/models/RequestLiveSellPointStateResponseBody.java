// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestLiveSellPointStateResponseBody extends TeaModel {
    @NameInMap("Data")
    public RequestLiveSellPointStateResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RequestLiveSellPointStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestLiveSellPointStateResponseBody self = new RequestLiveSellPointStateResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestLiveSellPointStateResponseBody setData(RequestLiveSellPointStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestLiveSellPointStateResponseBodyData getData() {
        return this.data;
    }

    public RequestLiveSellPointStateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestLiveSellPointStateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestLiveSellPointStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestLiveSellPointStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestLiveSellPointStateResponseBodyData extends TeaModel {
        @NameInMap("Display")
        public Boolean display;

        public static RequestLiveSellPointStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestLiveSellPointStateResponseBodyData self = new RequestLiveSellPointStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestLiveSellPointStateResponseBodyData setDisplay(Boolean display) {
            this.display = display;
            return this;
        }
        public Boolean getDisplay() {
            return this.display;
        }

    }

}
