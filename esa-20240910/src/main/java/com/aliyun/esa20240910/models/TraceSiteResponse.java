// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TraceSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TraceSiteResponseBody body;

    public static TraceSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        TraceSiteResponse self = new TraceSiteResponse();
        return TeaModel.build(map, self);
    }

    public TraceSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TraceSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TraceSiteResponse setBody(TraceSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public TraceSiteResponseBody getBody() {
        return this.body;
    }

}
