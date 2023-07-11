// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserRasterDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserRasterDatasResponseBody body;

    public static DeleteUserRasterDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRasterDatasResponse self = new DeleteUserRasterDatasResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserRasterDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserRasterDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserRasterDatasResponse setBody(DeleteUserRasterDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserRasterDatasResponseBody getBody() {
        return this.body;
    }

}
