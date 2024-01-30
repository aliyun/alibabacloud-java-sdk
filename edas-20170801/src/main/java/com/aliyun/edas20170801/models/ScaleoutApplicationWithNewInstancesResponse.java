// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleoutApplicationWithNewInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleoutApplicationWithNewInstancesResponseBody body;

    public static ScaleoutApplicationWithNewInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleoutApplicationWithNewInstancesResponse self = new ScaleoutApplicationWithNewInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ScaleoutApplicationWithNewInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleoutApplicationWithNewInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleoutApplicationWithNewInstancesResponse setBody(ScaleoutApplicationWithNewInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleoutApplicationWithNewInstancesResponseBody getBody() {
        return this.body;
    }

}
