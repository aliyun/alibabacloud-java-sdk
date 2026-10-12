// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeletePortalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePortalResponseBody body;

    public static DeletePortalResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePortalResponse self = new DeletePortalResponse();
        return TeaModel.build(map, self);
    }

    public DeletePortalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePortalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePortalResponse setBody(DeletePortalResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePortalResponseBody getBody() {
        return this.body;
    }

}
