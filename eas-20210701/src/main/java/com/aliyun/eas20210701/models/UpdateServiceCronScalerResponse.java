// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceCronScalerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateServiceCronScalerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceCronScalerResponse setBody(UpdateServiceCronScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceCronScalerResponseBody getBody() {
        return this.body;
    }

}
