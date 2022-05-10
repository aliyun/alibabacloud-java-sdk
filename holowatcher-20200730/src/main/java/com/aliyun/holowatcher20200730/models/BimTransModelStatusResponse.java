// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimTransModelStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BimTransModelStatusResponseBody body;

    public static BimTransModelStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BimTransModelStatusResponse self = new BimTransModelStatusResponse();
        return TeaModel.build(map, self);
    }

    public BimTransModelStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimTransModelStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BimTransModelStatusResponse setBody(BimTransModelStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BimTransModelStatusResponseBody getBody() {
        return this.body;
    }

}
