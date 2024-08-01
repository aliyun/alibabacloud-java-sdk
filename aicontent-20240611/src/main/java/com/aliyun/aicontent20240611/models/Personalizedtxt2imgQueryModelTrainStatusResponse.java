// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryModelTrainStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Personalizedtxt2imgQueryModelTrainStatusResponseBody body;

    public static Personalizedtxt2imgQueryModelTrainStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryModelTrainStatusResponse self = new Personalizedtxt2imgQueryModelTrainStatusResponse();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Personalizedtxt2imgQueryModelTrainStatusResponse setBody(Personalizedtxt2imgQueryModelTrainStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public Personalizedtxt2imgQueryModelTrainStatusResponseBody getBody() {
        return this.body;
    }

}
