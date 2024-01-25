// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceAutoScalerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceAutoScalerResponseBody body;

    public static CreateServiceAutoScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAutoScalerResponse self = new CreateServiceAutoScalerResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceAutoScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceAutoScalerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceAutoScalerResponse setBody(CreateServiceAutoScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

}
