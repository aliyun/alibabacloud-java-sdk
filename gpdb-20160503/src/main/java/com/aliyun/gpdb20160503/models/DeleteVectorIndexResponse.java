// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteVectorIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVectorIndexResponseBody body;

    public static DeleteVectorIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVectorIndexResponse self = new DeleteVectorIndexResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVectorIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVectorIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVectorIndexResponse setBody(DeleteVectorIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVectorIndexResponseBody getBody() {
        return this.body;
    }

}
