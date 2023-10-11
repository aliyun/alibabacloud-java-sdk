// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteScenegroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScenegroupMemberResponseBody body;

    public static DeleteScenegroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScenegroupMemberResponse self = new DeleteScenegroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScenegroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScenegroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteScenegroupMemberResponse setBody(DeleteScenegroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScenegroupMemberResponseBody getBody() {
        return this.body;
    }

}
