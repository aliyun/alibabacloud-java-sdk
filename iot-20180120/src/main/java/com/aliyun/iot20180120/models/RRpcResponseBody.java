// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RRpcResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("MessageId")
    public Long messageId;

    @NameInMap("PayloadBase64Byte")
    public String payloadBase64Byte;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RrpcCode")
    public String rrpcCode;

    @NameInMap("Success")
    public Boolean success;

    public static RRpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RRpcResponseBody self = new RRpcResponseBody();
        return TeaModel.build(map, self);
    }

    public RRpcResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RRpcResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RRpcResponseBody setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

    public RRpcResponseBody setPayloadBase64Byte(String payloadBase64Byte) {
        this.payloadBase64Byte = payloadBase64Byte;
        return this;
    }
    public String getPayloadBase64Byte() {
        return this.payloadBase64Byte;
    }

    public RRpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RRpcResponseBody setRrpcCode(String rrpcCode) {
        this.rrpcCode = rrpcCode;
        return this;
    }
    public String getRrpcCode() {
        return this.rrpcCode;
    }

    public RRpcResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
