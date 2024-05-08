// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceLivenessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceLivenessResponseBody body;

    public static FaceLivenessResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessResponse self = new FaceLivenessResponse();
        return TeaModel.build(map, self);
    }

    public FaceLivenessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceLivenessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceLivenessResponse setBody(FaceLivenessResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceLivenessResponseBody getBody() {
        return this.body;
    }

}
