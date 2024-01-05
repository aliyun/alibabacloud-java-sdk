// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class PublishGraphSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishGraphSchemaResponseBody body;

    public static PublishGraphSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishGraphSchemaResponse self = new PublishGraphSchemaResponse();
        return TeaModel.build(map, self);
    }

    public PublishGraphSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishGraphSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishGraphSchemaResponse setBody(PublishGraphSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishGraphSchemaResponseBody getBody() {
        return this.body;
    }

}
