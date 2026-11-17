// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListWebFilterTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebFilterTemplatesResponseBody body;

    public static ListWebFilterTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebFilterTemplatesResponse self = new ListWebFilterTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListWebFilterTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebFilterTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebFilterTemplatesResponse setBody(ListWebFilterTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWebFilterTemplatesResponseBody getBody() {
        return this.body;
    }

}
