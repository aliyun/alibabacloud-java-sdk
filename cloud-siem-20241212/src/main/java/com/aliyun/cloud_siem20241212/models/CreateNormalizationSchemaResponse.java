// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateNormalizationSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNormalizationSchemaResponseBody body;

    public static CreateNormalizationSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNormalizationSchemaResponse self = new CreateNormalizationSchemaResponse();
        return TeaModel.build(map, self);
    }

    public CreateNormalizationSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNormalizationSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNormalizationSchemaResponse setBody(CreateNormalizationSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNormalizationSchemaResponseBody getBody() {
        return this.body;
    }

}
