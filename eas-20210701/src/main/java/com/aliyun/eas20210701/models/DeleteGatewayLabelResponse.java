// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGatewayLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGatewayLabelResponseBody body;

    public static DeleteGatewayLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayLabelResponse self = new DeleteGatewayLabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayLabelResponse setBody(DeleteGatewayLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayLabelResponseBody getBody() {
        return this.body;
    }

}
