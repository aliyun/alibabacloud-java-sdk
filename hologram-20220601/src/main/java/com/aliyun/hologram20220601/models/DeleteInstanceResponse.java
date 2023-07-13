// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceResponseBody body;

    public static DeleteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResponse self = new DeleteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceResponse setBody(DeleteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceResponseBody getBody() {
        return this.body;
    }

}
