// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddScenegroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddScenegroupMemberResponseBody body;

    public static AddScenegroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddScenegroupMemberResponse self = new AddScenegroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddScenegroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddScenegroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddScenegroupMemberResponse setBody(AddScenegroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddScenegroupMemberResponseBody getBody() {
        return this.body;
    }

}
