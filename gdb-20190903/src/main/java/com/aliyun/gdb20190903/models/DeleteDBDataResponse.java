// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class DeleteDBDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBDataResponseBody body;

    public static DeleteDBDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBDataResponse self = new DeleteDBDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBDataResponse setBody(DeleteDBDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBDataResponseBody getBody() {
        return this.body;
    }

}
