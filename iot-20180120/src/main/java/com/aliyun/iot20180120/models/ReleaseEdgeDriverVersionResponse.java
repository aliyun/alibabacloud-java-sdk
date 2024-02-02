// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReleaseEdgeDriverVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseEdgeDriverVersionResponseBody body;

    public static ReleaseEdgeDriverVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEdgeDriverVersionResponse self = new ReleaseEdgeDriverVersionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseEdgeDriverVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseEdgeDriverVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseEdgeDriverVersionResponse setBody(ReleaseEdgeDriverVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

}
