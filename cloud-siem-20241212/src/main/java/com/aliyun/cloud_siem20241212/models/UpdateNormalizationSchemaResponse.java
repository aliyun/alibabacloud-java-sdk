// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateNormalizationSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNormalizationSchemaResponseBody body;

    public static UpdateNormalizationSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalizationSchemaResponse self = new UpdateNormalizationSchemaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNormalizationSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNormalizationSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNormalizationSchemaResponse setBody(UpdateNormalizationSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNormalizationSchemaResponseBody getBody() {
        return this.body;
    }

}
