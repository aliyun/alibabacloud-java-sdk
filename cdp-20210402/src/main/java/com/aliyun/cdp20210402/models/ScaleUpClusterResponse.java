// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ScaleUpClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleUpClusterResponseBody body;

    public static ScaleUpClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleUpClusterResponse self = new ScaleUpClusterResponse();
        return TeaModel.build(map, self);
    }

    public ScaleUpClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleUpClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleUpClusterResponse setBody(ScaleUpClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleUpClusterResponseBody getBody() {
        return this.body;
    }

}
