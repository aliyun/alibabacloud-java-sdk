// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetAccountInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static SetAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccountInfoResponseBody self = new SetAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
