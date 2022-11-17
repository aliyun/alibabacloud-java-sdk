// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class ErrorCode extends TeaModel {
    @NameInMap("ErrorCode")
    public java.util.List<byte[]> errorCode;

    @NameInMap("ErrorMessage")
    public byte[] errorMessage;

    public static ErrorCode build(java.util.Map<String, ?> map) throws Exception {
        ErrorCode self = new ErrorCode();
        return TeaModel.build(map, self);
    }

    public ErrorCode setErrorCode(java.util.List<byte[]> errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public java.util.List<byte[]> getErrorCode() {
        return this.errorCode;
    }

    public ErrorCode setErrorMessage(byte[] errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public byte[] getErrorMessage() {
        return this.errorMessage;
    }

}
