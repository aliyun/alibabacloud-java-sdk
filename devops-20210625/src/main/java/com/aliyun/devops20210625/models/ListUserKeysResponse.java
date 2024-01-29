// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListUserKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserKeysResponseBody body;

    public static ListUserKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserKeysResponse self = new ListUserKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListUserKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserKeysResponse setBody(ListUserKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserKeysResponseBody getBody() {
        return this.body;
    }

}
