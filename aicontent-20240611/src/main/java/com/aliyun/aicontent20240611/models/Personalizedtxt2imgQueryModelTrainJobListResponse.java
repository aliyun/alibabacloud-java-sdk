// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryModelTrainJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Personalizedtxt2imgQueryModelTrainJobListResponseBody body;

    public static Personalizedtxt2imgQueryModelTrainJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryModelTrainJobListResponse self = new Personalizedtxt2imgQueryModelTrainJobListResponse();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryModelTrainJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Personalizedtxt2imgQueryModelTrainJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Personalizedtxt2imgQueryModelTrainJobListResponse setBody(Personalizedtxt2imgQueryModelTrainJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public Personalizedtxt2imgQueryModelTrainJobListResponseBody getBody() {
        return this.body;
    }

}
