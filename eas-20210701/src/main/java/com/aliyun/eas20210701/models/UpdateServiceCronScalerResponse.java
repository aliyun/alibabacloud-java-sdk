// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceCronScalerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServiceCronScalerResponseBody body;

    public static UpdateServiceCronScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceCronScalerResponse self = new UpdateServiceCronScalerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceCronScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceCronScalerResponse setBody(UpdateServiceCronScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceCronScalerResponseBody getBody() {
        return this.body;
    }

}
