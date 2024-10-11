// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RebuildIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebuildIndexResponseBody body;

    public static RebuildIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildIndexResponse self = new RebuildIndexResponse();
        return TeaModel.build(map, self);
    }

    public RebuildIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebuildIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebuildIndexResponse setBody(RebuildIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public RebuildIndexResponseBody getBody() {
        return this.body;
    }

}
