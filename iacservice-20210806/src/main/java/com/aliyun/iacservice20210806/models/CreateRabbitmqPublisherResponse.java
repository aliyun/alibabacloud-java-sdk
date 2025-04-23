// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRabbitmqPublisherResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRabbitmqPublisherResponseBody body;

    public static CreateRabbitmqPublisherResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRabbitmqPublisherResponse self = new CreateRabbitmqPublisherResponse();
        return TeaModel.build(map, self);
    }

    public CreateRabbitmqPublisherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRabbitmqPublisherResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRabbitmqPublisherResponse setBody(CreateRabbitmqPublisherResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRabbitmqPublisherResponseBody getBody() {
        return this.body;
    }

}
