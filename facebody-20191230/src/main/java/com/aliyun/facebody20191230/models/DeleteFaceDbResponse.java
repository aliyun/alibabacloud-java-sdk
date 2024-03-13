// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceDbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceDbResponseBody body;

    public static DeleteFaceDbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDbResponse self = new DeleteFaceDbResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceDbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceDbResponse setBody(DeleteFaceDbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceDbResponseBody getBody() {
        return this.body;
    }

}
