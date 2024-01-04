// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class MobileRecommendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MobileRecommendResponseBody body;

    public static MobileRecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        MobileRecommendResponse self = new MobileRecommendResponse();
        return TeaModel.build(map, self);
    }

    public MobileRecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MobileRecommendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MobileRecommendResponse setBody(MobileRecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public MobileRecommendResponseBody getBody() {
        return this.body;
    }

}
