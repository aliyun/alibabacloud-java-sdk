// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckAssumeSlrRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAssumeSlrRoleResponseBody body;

    public static CheckAssumeSlrRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAssumeSlrRoleResponse self = new CheckAssumeSlrRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckAssumeSlrRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAssumeSlrRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAssumeSlrRoleResponse setBody(CheckAssumeSlrRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAssumeSlrRoleResponseBody getBody() {
        return this.body;
    }

}
