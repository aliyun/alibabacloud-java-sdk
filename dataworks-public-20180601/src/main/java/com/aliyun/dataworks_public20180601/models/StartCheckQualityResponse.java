// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartCheckQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartCheckQualityResponseBody body;

    public static StartCheckQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCheckQualityResponse self = new StartCheckQualityResponse();
        return TeaModel.build(map, self);
    }

    public StartCheckQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCheckQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCheckQualityResponse setBody(StartCheckQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCheckQualityResponseBody getBody() {
        return this.body;
    }

}
