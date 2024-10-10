// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceQuotasResponseBody body;

    public static ListInstanceQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceQuotasResponse self = new ListInstanceQuotasResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceQuotasResponse setBody(ListInstanceQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceQuotasResponseBody getBody() {
        return this.body;
    }

}
