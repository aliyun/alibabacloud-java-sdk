// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetCreditLimitResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static SetCreditLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLimitResponseBody self = new SetCreditLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCreditLimitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetCreditLimitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetCreditLimitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
