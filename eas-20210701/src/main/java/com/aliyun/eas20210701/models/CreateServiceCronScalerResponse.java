// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceCronScalerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateServiceCronScalerResponse setBody(CreateServiceCronScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceCronScalerResponseBody getBody() {
        return this.body;
    }

}
