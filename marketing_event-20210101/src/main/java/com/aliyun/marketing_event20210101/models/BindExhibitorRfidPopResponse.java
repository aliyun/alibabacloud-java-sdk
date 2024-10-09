// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class BindExhibitorRfidPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindExhibitorRfidPopResponseBody body;

    public static BindExhibitorRfidPopResponse build(java.util.Map<String, ?> map) throws Exception {
        BindExhibitorRfidPopResponse self = new BindExhibitorRfidPopResponse();
        return TeaModel.build(map, self);
    }

    public BindExhibitorRfidPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindExhibitorRfidPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindExhibitorRfidPopResponse setBody(BindExhibitorRfidPopResponseBody body) {
        this.body = body;
        return this;
    }
    public BindExhibitorRfidPopResponseBody getBody() {
        return this.body;
    }

}
