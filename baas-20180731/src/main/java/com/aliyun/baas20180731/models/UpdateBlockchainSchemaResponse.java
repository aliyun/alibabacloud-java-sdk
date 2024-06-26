// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateBlockchainSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBlockchainSchemaResponseBody body;

    public static UpdateBlockchainSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainSchemaResponse self = new UpdateBlockchainSchemaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBlockchainSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBlockchainSchemaResponse setBody(UpdateBlockchainSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBlockchainSchemaResponseBody getBody() {
        return this.body;
    }

}
