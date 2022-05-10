// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimProjectDeleteFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BimProjectDeleteFileResponseBody body;

    public static BimProjectDeleteFileResponse build(java.util.Map<String, ?> map) throws Exception {
        BimProjectDeleteFileResponse self = new BimProjectDeleteFileResponse();
        return TeaModel.build(map, self);
    }

    public BimProjectDeleteFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimProjectDeleteFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BimProjectDeleteFileResponse setBody(BimProjectDeleteFileResponseBody body) {
        this.body = body;
        return this;
    }
    public BimProjectDeleteFileResponseBody getBody() {
        return this.body;
    }

}
