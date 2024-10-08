// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteListResponseBody body;

    public static DeleteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteListResponse self = new DeleteListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteListResponse setBody(DeleteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteListResponseBody getBody() {
        return this.body;
    }

}
