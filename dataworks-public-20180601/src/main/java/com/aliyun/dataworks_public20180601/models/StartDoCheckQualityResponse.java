// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartDoCheckQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartDoCheckQualityResponseBody body;

    public static StartDoCheckQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDoCheckQualityResponse self = new StartDoCheckQualityResponse();
        return TeaModel.build(map, self);
    }

    public StartDoCheckQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDoCheckQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDoCheckQualityResponse setBody(StartDoCheckQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDoCheckQualityResponseBody getBody() {
        return this.body;
    }

}
