// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceResponseBody body;

    public static DeleteFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceResponse self = new DeleteFaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceResponse setBody(DeleteFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceResponseBody getBody() {
        return this.body;
    }

}
