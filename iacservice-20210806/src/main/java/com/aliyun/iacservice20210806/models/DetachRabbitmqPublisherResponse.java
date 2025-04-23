// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DetachRabbitmqPublisherResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachRabbitmqPublisherResponseBody body;

    public static DetachRabbitmqPublisherResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachRabbitmqPublisherResponse self = new DetachRabbitmqPublisherResponse();
        return TeaModel.build(map, self);
    }

    public DetachRabbitmqPublisherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachRabbitmqPublisherResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachRabbitmqPublisherResponse setBody(DetachRabbitmqPublisherResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachRabbitmqPublisherResponseBody getBody() {
        return this.body;
    }

}
