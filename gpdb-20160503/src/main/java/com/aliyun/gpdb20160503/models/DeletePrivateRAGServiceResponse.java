// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeletePrivateRAGServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrivateRAGServiceResponseBody body;

    public static DeletePrivateRAGServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateRAGServiceResponse self = new DeletePrivateRAGServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivateRAGServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivateRAGServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivateRAGServiceResponse setBody(DeletePrivateRAGServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivateRAGServiceResponseBody getBody() {
        return this.body;
    }

}
