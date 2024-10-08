// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeletePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePageResponseBody body;

    public static DeletePageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePageResponse self = new DeletePageResponse();
        return TeaModel.build(map, self);
    }

    public DeletePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePageResponse setBody(DeletePageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePageResponseBody getBody() {
        return this.body;
    }

}
