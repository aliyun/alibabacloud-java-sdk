// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceAutoScalerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceAutoScalerResponseBody body;

    public static UpdateServiceAutoScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceAutoScalerResponse self = new UpdateServiceAutoScalerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceAutoScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceAutoScalerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceAutoScalerResponse setBody(UpdateServiceAutoScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

}
