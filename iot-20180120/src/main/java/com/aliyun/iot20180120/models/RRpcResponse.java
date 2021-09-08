// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RRpcResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("RrpcCode")
    @Validation(required = true)
    public String rrpcCode;

    @NameInMap("PayloadBase64Byte")
    @Validation(required = true)
    public String payloadBase64Byte;

    @NameInMap("MessageId")
    @Validation(required = true)
    public Long messageId;

    public static RRpcResponse build(java.util.Map<String, ?> map) throws Exception {
        RRpcResponse self = new RRpcResponse();
        return TeaModel.build(map, self);
    }

    public RRpcResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RRpcResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RRpcResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RRpcResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RRpcResponse setRrpcCode(String rrpcCode) {
        this.rrpcCode = rrpcCode;
        return this;
    }
    public String getRrpcCode() {
        return this.rrpcCode;
    }

    public RRpcResponse setPayloadBase64Byte(String payloadBase64Byte) {
        this.payloadBase64Byte = payloadBase64Byte;
        return this;
    }
    public String getPayloadBase64Byte() {
        return this.payloadBase64Byte;
    }

    public RRpcResponse setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

}
