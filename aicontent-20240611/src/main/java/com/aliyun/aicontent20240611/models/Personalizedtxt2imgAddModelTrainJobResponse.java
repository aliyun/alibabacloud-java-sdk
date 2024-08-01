// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgAddModelTrainJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Personalizedtxt2imgAddModelTrainJobResponseBody body;

    public static Personalizedtxt2imgAddModelTrainJobResponse build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgAddModelTrainJobResponse self = new Personalizedtxt2imgAddModelTrainJobResponse();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgAddModelTrainJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Personalizedtxt2imgAddModelTrainJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Personalizedtxt2imgAddModelTrainJobResponse setBody(Personalizedtxt2imgAddModelTrainJobResponseBody body) {
        this.body = body;
        return this;
    }
    public Personalizedtxt2imgAddModelTrainJobResponseBody getBody() {
        return this.body;
    }

}
