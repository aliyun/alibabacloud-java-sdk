// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListHBaseQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHBaseQuotasResponseBody body;

    public static ListHBaseQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHBaseQuotasResponse self = new ListHBaseQuotasResponse();
        return TeaModel.build(map, self);
    }

    public ListHBaseQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHBaseQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHBaseQuotasResponse setBody(ListHBaseQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHBaseQuotasResponseBody getBody() {
        return this.body;
    }

}
