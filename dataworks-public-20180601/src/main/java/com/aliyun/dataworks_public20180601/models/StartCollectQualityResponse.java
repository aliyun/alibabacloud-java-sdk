// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartCollectQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartCollectQualityResponseBody body;

    public static StartCollectQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCollectQualityResponse self = new StartCollectQualityResponse();
        return TeaModel.build(map, self);
    }

    public StartCollectQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCollectQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCollectQualityResponse setBody(StartCollectQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCollectQualityResponseBody getBody() {
        return this.body;
    }

}
