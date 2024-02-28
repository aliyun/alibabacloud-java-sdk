// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotasResponseBody body;

    public static ListQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasResponse self = new ListQuotasResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotasResponse setBody(ListQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotasResponseBody getBody() {
        return this.body;
    }

}
