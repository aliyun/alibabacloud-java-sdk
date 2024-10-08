// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurgeCachesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurgeCachesResponseBody body;

    public static PurgeCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        PurgeCachesResponse self = new PurgeCachesResponse();
        return TeaModel.build(map, self);
    }

    public PurgeCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurgeCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurgeCachesResponse setBody(PurgeCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public PurgeCachesResponseBody getBody() {
        return this.body;
    }

}
