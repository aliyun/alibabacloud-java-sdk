// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceAutoScalerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceAutoScalerResponseBody body;

    public static DeleteServiceAutoScalerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceAutoScalerResponse self = new DeleteServiceAutoScalerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceAutoScalerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceAutoScalerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceAutoScalerResponse setBody(DeleteServiceAutoScalerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

}
