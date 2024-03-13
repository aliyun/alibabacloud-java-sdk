// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceEntityResponseBody body;

    public static DeleteFaceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceEntityResponse self = new DeleteFaceEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceEntityResponse setBody(DeleteFaceEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceEntityResponseBody getBody() {
        return this.body;
    }

}
