// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListWhitelistUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListWhitelistUserResponseBody body;

    public static ListWhitelistUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWhitelistUserResponse self = new ListWhitelistUserResponse();
        return TeaModel.build(map, self);
    }

    public ListWhitelistUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWhitelistUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWhitelistUserResponse setBody(ListWhitelistUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWhitelistUserResponseBody getBody() {
        return this.body;
    }

}
