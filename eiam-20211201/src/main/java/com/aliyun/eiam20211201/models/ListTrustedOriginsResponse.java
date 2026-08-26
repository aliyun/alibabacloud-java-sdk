// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListTrustedOriginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrustedOriginsResponseBody body;

    public static ListTrustedOriginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrustedOriginsResponse self = new ListTrustedOriginsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrustedOriginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrustedOriginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrustedOriginsResponse setBody(ListTrustedOriginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrustedOriginsResponseBody getBody() {
        return this.body;
    }

}
