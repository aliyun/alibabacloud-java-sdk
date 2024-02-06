// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpEventByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcdpEventByIdResponseBody body;

    public static DeleteMcdpEventByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpEventByIdResponse self = new DeleteMcdpEventByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpEventByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcdpEventByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcdpEventByIdResponse setBody(DeleteMcdpEventByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcdpEventByIdResponseBody getBody() {
        return this.body;
    }

}
