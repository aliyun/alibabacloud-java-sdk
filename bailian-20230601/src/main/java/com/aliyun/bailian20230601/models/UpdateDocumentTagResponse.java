// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateDocumentTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDocumentTagResponseBody body;

    public static UpdateDocumentTagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocumentTagResponse self = new UpdateDocumentTagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDocumentTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDocumentTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDocumentTagResponse setBody(UpdateDocumentTagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDocumentTagResponseBody getBody() {
        return this.body;
    }

}
