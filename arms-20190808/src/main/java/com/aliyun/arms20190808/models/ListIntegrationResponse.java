// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationResponseBody body;

    public static ListIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationResponse self = new ListIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationResponse setBody(ListIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationResponseBody getBody() {
        return this.body;
    }

}
