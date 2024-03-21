// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccessPointResponseBody body;

    public static DeleteAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessPointResponse self = new DeleteAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessPointResponse setBody(DeleteAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessPointResponseBody getBody() {
        return this.body;
    }

}
