// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkwan20181030.models;

import com.aliyun.tea.*;

public class SubmitKpmEncryptedNodeTupleOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitKpmEncryptedNodeTupleOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitKpmEncryptedNodeTupleOrderResponseBody self = new SubmitKpmEncryptedNodeTupleOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitKpmEncryptedNodeTupleOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitKpmEncryptedNodeTupleOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitKpmEncryptedNodeTupleOrderResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public SubmitKpmEncryptedNodeTupleOrderResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public SubmitKpmEncryptedNodeTupleOrderResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public SubmitKpmEncryptedNodeTupleOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitKpmEncryptedNodeTupleOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
