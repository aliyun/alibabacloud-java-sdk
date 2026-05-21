// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class OpenDatasetResourceUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenDatasetResourceUrlResponseBody body;

    public static OpenDatasetResourceUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDatasetResourceUrlResponse self = new OpenDatasetResourceUrlResponse();
        return TeaModel.build(map, self);
    }

    public OpenDatasetResourceUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDatasetResourceUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenDatasetResourceUrlResponse setBody(OpenDatasetResourceUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDatasetResourceUrlResponseBody getBody() {
        return this.body;
    }

}
