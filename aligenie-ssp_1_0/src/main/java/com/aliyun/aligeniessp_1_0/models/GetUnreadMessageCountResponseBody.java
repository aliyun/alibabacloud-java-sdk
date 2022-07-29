// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUnreadMessageCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Result")
    public Integer result;

    public static GetUnreadMessageCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnreadMessageCountResponseBody self = new GetUnreadMessageCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnreadMessageCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUnreadMessageCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUnreadMessageCountResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

}
