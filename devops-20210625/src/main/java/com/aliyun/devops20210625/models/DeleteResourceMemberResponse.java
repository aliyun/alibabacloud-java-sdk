// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteResourceMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceMemberResponseBody body;

    public static DeleteResourceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceMemberResponse self = new DeleteResourceMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceMemberResponse setBody(DeleteResourceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceMemberResponseBody getBody() {
        return this.body;
    }

}
