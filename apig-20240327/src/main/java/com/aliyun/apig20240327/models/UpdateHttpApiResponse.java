// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHttpApiResponseBody body;

    public static UpdateHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiResponse self = new UpdateHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHttpApiResponse setBody(UpdateHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpApiResponseBody getBody() {
        return this.body;
    }

}
