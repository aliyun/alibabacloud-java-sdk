// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AsyncRRpcResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.device.InvalidFormattedDeviceName</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>889455942124347392</p>
     */
    @NameInMap("MessageId")
    public Long messageId;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AsyncRRpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsyncRRpcResponseBody self = new AsyncRRpcResponseBody();
        return TeaModel.build(map, self);
    }

    public AsyncRRpcResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AsyncRRpcResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AsyncRRpcResponseBody setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

    public AsyncRRpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsyncRRpcResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
