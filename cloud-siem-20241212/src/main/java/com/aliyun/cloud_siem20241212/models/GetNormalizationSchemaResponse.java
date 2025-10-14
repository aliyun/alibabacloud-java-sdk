// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNormalizationSchemaResponseBody body;

    public static GetNormalizationSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationSchemaResponse self = new GetNormalizationSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetNormalizationSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNormalizationSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNormalizationSchemaResponse setBody(GetNormalizationSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNormalizationSchemaResponseBody getBody() {
        return this.body;
    }

}
