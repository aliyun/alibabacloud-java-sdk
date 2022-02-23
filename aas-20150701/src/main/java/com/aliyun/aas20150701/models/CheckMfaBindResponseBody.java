// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CheckMfaBindResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("IsBindMfa")
    public Boolean isBindMfa;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckMfaBindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMfaBindResponseBody self = new CheckMfaBindResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMfaBindResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CheckMfaBindResponseBody setIsBindMfa(Boolean isBindMfa) {
        this.isBindMfa = isBindMfa;
        return this;
    }
    public Boolean getIsBindMfa() {
        return this.isBindMfa;
    }

    public CheckMfaBindResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckMfaBindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMfaBindResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
