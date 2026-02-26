// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCredentialsResponseBody body;

    public static ListCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsResponse self = new ListCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public ListCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCredentialsResponse setBody(ListCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCredentialsResponseBody getBody() {
        return this.body;
    }

}
