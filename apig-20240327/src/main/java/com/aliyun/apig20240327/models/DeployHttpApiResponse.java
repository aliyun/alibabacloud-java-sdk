// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeployHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployHttpApiResponseBody body;

    public static DeployHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployHttpApiResponse self = new DeployHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public DeployHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployHttpApiResponse setBody(DeployHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployHttpApiResponseBody getBody() {
        return this.body;
    }

}
