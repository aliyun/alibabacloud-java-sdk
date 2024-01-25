// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceCronScalerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceCronScalerResponseBody body;

    public static CreateServiceCronScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceCronScalerResponse self = new CreateServiceCronScalerResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceCronScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceCronScalerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceCronScalerResponse setBody(CreateServiceCronScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceCronScalerResponseBody getBody() {
        return this.body;
    }

}
