// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTableBusinessMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTableBusinessMetadataResponseBody body;

    public static UpdateTableBusinessMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableBusinessMetadataResponse self = new UpdateTableBusinessMetadataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableBusinessMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableBusinessMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableBusinessMetadataResponse setBody(UpdateTableBusinessMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableBusinessMetadataResponseBody getBody() {
        return this.body;
    }

}
