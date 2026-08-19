// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateConnectorClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConnectorClientResponseBody body;

    public static UpdateConnectorClientResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorClientResponse self = new UpdateConnectorClientResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConnectorClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConnectorClientResponse setBody(UpdateConnectorClientResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConnectorClientResponseBody getBody() {
        return this.body;
    }

}
