// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceCompareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceCompareResponseBody body;

    public static FaceCompareResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareResponse self = new FaceCompareResponse();
        return TeaModel.build(map, self);
    }

    public FaceCompareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceCompareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceCompareResponse setBody(FaceCompareResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceCompareResponseBody getBody() {
        return this.body;
    }

}
