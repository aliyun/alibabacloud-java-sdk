// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteSemanticJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSemanticJobResponseBody body;

    public static DeleteSemanticJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSemanticJobResponse self = new DeleteSemanticJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSemanticJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSemanticJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSemanticJobResponse setBody(DeleteSemanticJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSemanticJobResponseBody getBody() {
        return this.body;
    }

}
