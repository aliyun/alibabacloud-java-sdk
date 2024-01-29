// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateResourceMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceMemberResponseBody body;

    public static CreateResourceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceMemberResponse self = new CreateResourceMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceMemberResponse setBody(CreateResourceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceMemberResponseBody getBody() {
        return this.body;
    }

}
