// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserMapserviceDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserMapserviceDatasResponseBody body;

    public static DeleteUserMapserviceDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserMapserviceDatasResponse self = new DeleteUserMapserviceDatasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserMapserviceDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserMapserviceDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserMapserviceDatasResponse setBody(DeleteUserMapserviceDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserMapserviceDatasResponseBody getBody() {
        return this.body;
    }

}
