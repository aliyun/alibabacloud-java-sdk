// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeletePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePackageResponseBody body;

    public static DeletePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePackageResponse self = new DeletePackageResponse();
        return TeaModel.build(map, self);
    }

    public DeletePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePackageResponse setBody(DeletePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePackageResponseBody getBody() {
        return this.body;
    }

}
