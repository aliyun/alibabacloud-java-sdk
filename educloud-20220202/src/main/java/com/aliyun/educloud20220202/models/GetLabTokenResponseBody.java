// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class GetLabTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetLabTokenResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetLabTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLabTokenResponseBody self = new GetLabTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLabTokenResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetLabTokenResponseBody setData(GetLabTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLabTokenResponseBodyData getData() {
        return this.data;
    }

    public GetLabTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLabTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLabTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLabTokenResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Url")
        public String url;

        public static GetLabTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLabTokenResponseBodyData self = new GetLabTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLabTokenResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetLabTokenResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
