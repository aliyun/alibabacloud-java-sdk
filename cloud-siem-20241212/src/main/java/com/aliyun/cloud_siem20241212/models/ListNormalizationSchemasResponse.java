// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNormalizationSchemasResponseBody body;

    public static ListNormalizationSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationSchemasResponse self = new ListNormalizationSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListNormalizationSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNormalizationSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNormalizationSchemasResponse setBody(ListNormalizationSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNormalizationSchemasResponseBody getBody() {
        return this.body;
    }

}
