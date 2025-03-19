// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UndeployHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UndeployHttpApiResponseBody body;

    public static UndeployHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UndeployHttpApiResponse self = new UndeployHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public UndeployHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UndeployHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UndeployHttpApiResponse setBody(UndeployHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UndeployHttpApiResponseBody getBody() {
        return this.body;
    }

}
