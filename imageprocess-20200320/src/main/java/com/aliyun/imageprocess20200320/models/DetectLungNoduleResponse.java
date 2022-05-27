// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLungNoduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectLungNoduleResponseBody body;

    public static DetectLungNoduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectLungNoduleResponse self = new DetectLungNoduleResponse();
        return TeaModel.build(map, self);
    }

    public DetectLungNoduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectLungNoduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectLungNoduleResponse setBody(DetectLungNoduleResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectLungNoduleResponseBody getBody() {
        return this.body;
    }

}
