// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ModifyMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMemberResponseBody body;

    public static ModifyMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberResponse self = new ModifyMemberResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMemberResponse setBody(ModifyMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMemberResponseBody getBody() {
        return this.body;
    }

}
