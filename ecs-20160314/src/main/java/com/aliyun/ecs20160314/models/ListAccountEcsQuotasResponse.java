// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ListAccountEcsQuotasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccountEcsQuotasResponseBody body;

    public static ListAccountEcsQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountEcsQuotasResponse self = new ListAccountEcsQuotasResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountEcsQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountEcsQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountEcsQuotasResponse setBody(ListAccountEcsQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountEcsQuotasResponseBody getBody() {
        return this.body;
    }

}
