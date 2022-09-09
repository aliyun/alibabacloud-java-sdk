// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AttachRabbitmqPublisherResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachRabbitmqPublisherResponseBody body;

    public static AttachRabbitmqPublisherResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachRabbitmqPublisherResponse self = new AttachRabbitmqPublisherResponse();
        return TeaModel.build(map, self);
    }

    public AttachRabbitmqPublisherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachRabbitmqPublisherResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachRabbitmqPublisherResponse setBody(AttachRabbitmqPublisherResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachRabbitmqPublisherResponseBody getBody() {
        return this.body;
    }

}
