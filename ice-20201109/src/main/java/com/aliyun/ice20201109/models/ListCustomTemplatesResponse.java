// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomTemplatesResponseBody body;

    public static ListCustomTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomTemplatesResponse self = new ListCustomTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomTemplatesResponse setBody(ListCustomTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomTemplatesResponseBody getBody() {
        return this.body;
    }

}
