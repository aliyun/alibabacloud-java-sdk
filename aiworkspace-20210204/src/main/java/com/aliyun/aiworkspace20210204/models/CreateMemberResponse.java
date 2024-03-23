// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMemberResponseBody body;

    public static CreateMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberResponse self = new CreateMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemberResponse setBody(CreateMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemberResponseBody getBody() {
        return this.body;
    }

}
