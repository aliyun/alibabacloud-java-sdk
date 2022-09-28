// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetZeroCreditShutdownStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static SetZeroCreditShutdownStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetZeroCreditShutdownStatusResponseBody self = new SetZeroCreditShutdownStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetZeroCreditShutdownStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetZeroCreditShutdownStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetZeroCreditShutdownStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
