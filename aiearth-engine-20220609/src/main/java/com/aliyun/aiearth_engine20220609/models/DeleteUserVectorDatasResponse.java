// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserVectorDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserVectorDatasResponseBody body;

    public static DeleteUserVectorDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserVectorDatasResponse self = new DeleteUserVectorDatasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserVectorDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserVectorDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserVectorDatasResponse setBody(DeleteUserVectorDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserVectorDatasResponseBody getBody() {
        return this.body;
    }

}
