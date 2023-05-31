// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLiverSteatosisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectLiverSteatosisResponseBody body;

    public static DetectLiverSteatosisResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectLiverSteatosisResponse self = new DetectLiverSteatosisResponse();
        return TeaModel.build(map, self);
    }

    public DetectLiverSteatosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectLiverSteatosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectLiverSteatosisResponse setBody(DetectLiverSteatosisResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectLiverSteatosisResponseBody getBody() {
        return this.body;
    }

}
