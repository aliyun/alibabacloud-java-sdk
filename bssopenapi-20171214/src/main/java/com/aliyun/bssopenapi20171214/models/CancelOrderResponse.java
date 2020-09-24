// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CancelOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public CancelOrderResponseData data;

    public static CancelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderResponse self = new CancelOrderResponse();
        return TeaModel.build(map, self);
    }

    public CancelOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CancelOrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelOrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelOrderResponse setData(CancelOrderResponseData data) {
        this.data = data;
        return this;
    }
    public CancelOrderResponseData getData() {
        return this.data;
    }

    public static class CancelOrderResponseData extends TeaModel {
        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        public static CancelOrderResponseData build(java.util.Map<String, ?> map) throws Exception {
            CancelOrderResponseData self = new CancelOrderResponseData();
            return TeaModel.build(map, self);
        }

        public CancelOrderResponseData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
