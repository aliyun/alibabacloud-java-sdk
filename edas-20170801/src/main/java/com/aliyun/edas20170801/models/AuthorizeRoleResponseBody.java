// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeRoleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static AuthorizeRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRoleResponseBody self = new AuthorizeRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthorizeRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeRoleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
