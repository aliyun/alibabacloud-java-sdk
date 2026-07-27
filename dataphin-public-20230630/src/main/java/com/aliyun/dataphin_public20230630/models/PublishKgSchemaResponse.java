// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishKgSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishKgSchemaResponseBody body;

    public static PublishKgSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishKgSchemaResponse self = new PublishKgSchemaResponse();
        return TeaModel.build(map, self);
    }

    public PublishKgSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishKgSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishKgSchemaResponse setBody(PublishKgSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishKgSchemaResponseBody getBody() {
        return this.body;
    }

}
