// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DropSearchIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DropSearchIndexResponseBody body;

    public static DropSearchIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        DropSearchIndexResponse self = new DropSearchIndexResponse();
        return TeaModel.build(map, self);
    }

    public DropSearchIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropSearchIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DropSearchIndexResponse setBody(DropSearchIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public DropSearchIndexResponseBody getBody() {
        return this.body;
    }

}
