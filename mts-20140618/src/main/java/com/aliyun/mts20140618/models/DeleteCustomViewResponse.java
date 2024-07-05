// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteCustomViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomViewResponseBody body;

    public static DeleteCustomViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomViewResponse self = new DeleteCustomViewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomViewResponse setBody(DeleteCustomViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomViewResponseBody getBody() {
        return this.body;
    }

}
