// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGatewayLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayLabelResponseBody body;

    public static UpdateGatewayLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayLabelResponse self = new UpdateGatewayLabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayLabelResponse setBody(UpdateGatewayLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayLabelResponseBody getBody() {
        return this.body;
    }

}
