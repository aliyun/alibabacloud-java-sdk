// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CheckUserIsGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckUserIsGroupMemberResponseBody body;

    public static CheckUserIsGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserIsGroupMemberResponse self = new CheckUserIsGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserIsGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserIsGroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUserIsGroupMemberResponse setBody(CheckUserIsGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserIsGroupMemberResponseBody getBody() {
        return this.body;
    }

}
