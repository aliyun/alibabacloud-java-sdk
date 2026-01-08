// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteGroupByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGroupByIdResponseBody body;

    public static DeleteGroupByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupByIdResponse self = new DeleteGroupByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupByIdResponse setBody(DeleteGroupByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupByIdResponseBody getBody() {
        return this.body;
    }

}
