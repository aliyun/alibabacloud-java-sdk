// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetZeroCreditShutdownPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static SetZeroCreditShutdownPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetZeroCreditShutdownPolicyResponseBody self = new SetZeroCreditShutdownPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetZeroCreditShutdownPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetZeroCreditShutdownPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetZeroCreditShutdownPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
