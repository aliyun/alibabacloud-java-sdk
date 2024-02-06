// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpEventAttributeByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcdpEventAttributeByIdResponseBody body;

    public static DeleteMcdpEventAttributeByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpEventAttributeByIdResponse self = new DeleteMcdpEventAttributeByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpEventAttributeByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcdpEventAttributeByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcdpEventAttributeByIdResponse setBody(DeleteMcdpEventAttributeByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcdpEventAttributeByIdResponseBody getBody() {
        return this.body;
    }

}
