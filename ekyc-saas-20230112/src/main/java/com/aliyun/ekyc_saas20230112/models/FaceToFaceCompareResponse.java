// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class FaceToFaceCompareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FaceToFaceCompareResponseBody body;

    public static FaceToFaceCompareResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceToFaceCompareResponse self = new FaceToFaceCompareResponse();
        return TeaModel.build(map, self);
    }

    public FaceToFaceCompareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceToFaceCompareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceToFaceCompareResponse setBody(FaceToFaceCompareResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceToFaceCompareResponseBody getBody() {
        return this.body;
    }

}
