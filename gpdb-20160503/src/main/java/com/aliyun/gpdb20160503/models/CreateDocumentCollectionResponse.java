// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDocumentCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDocumentCollectionResponseBody body;

    public static CreateDocumentCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentCollectionResponse self = new CreateDocumentCollectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDocumentCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDocumentCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDocumentCollectionResponse setBody(CreateDocumentCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDocumentCollectionResponseBody getBody() {
        return this.body;
    }

}
