// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceCronScalerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceCronScalerResponseBody body;

    public static DeleteServiceCronScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceCronScalerResponse self = new DeleteServiceCronScalerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceCronScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceCronScalerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceCronScalerResponse setBody(DeleteServiceCronScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceCronScalerResponseBody getBody() {
        return this.body;
    }

}
