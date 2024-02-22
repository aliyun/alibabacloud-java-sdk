// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateDocumentTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDocumentTagResponseBody body;

    public static CreateDocumentTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDocumentTagResponse self = new CreateDocumentTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateDocumentTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDocumentTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDocumentTagResponse setBody(CreateDocumentTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDocumentTagResponseBody getBody() {
        return this.body;
    }

}
