// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteNormalizationSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNormalizationSchemaResponseBody body;

    public static DeleteNormalizationSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNormalizationSchemaResponse self = new DeleteNormalizationSchemaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNormalizationSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNormalizationSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNormalizationSchemaResponse setBody(DeleteNormalizationSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNormalizationSchemaResponseBody getBody() {
        return this.body;
    }

}
