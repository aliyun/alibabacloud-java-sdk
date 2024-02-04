// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageBodiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectImageBodiesResponseBody body;

    public static DetectImageBodiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBodiesResponse self = new DetectImageBodiesResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageBodiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageBodiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectImageBodiesResponse setBody(DetectImageBodiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageBodiesResponseBody getBody() {
        return this.body;
    }

}
