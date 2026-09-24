// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GeneralRephotographyDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GeneralRephotographyDetectionResponseBody body;

    public static GeneralRephotographyDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GeneralRephotographyDetectionResponse self = new GeneralRephotographyDetectionResponse();
        return TeaModel.build(map, self);
    }

    public GeneralRephotographyDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeneralRephotographyDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GeneralRephotographyDetectionResponse setBody(GeneralRephotographyDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneralRephotographyDetectionResponseBody getBody() {
        return this.body;
    }

}
