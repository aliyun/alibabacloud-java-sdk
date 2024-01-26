// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIntegrationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIntegrationsResponseBody body;

    public static DeleteIntegrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationsResponse self = new DeleteIntegrationsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIntegrationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIntegrationsResponse setBody(DeleteIntegrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIntegrationsResponseBody getBody() {
        return this.body;
    }

}
