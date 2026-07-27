// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgSchemaPublishResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKgSchemaPublishResultResponseBody body;

    public static GetKgSchemaPublishResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKgSchemaPublishResultResponse self = new GetKgSchemaPublishResultResponse();
        return TeaModel.build(map, self);
    }

    public GetKgSchemaPublishResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKgSchemaPublishResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKgSchemaPublishResultResponse setBody(GetKgSchemaPublishResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKgSchemaPublishResultResponseBody getBody() {
        return this.body;
    }

}
