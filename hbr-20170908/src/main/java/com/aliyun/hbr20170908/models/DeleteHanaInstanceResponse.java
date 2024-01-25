// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteHanaInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHanaInstanceResponseBody body;

    public static DeleteHanaInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHanaInstanceResponse self = new DeleteHanaInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHanaInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHanaInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHanaInstanceResponse setBody(DeleteHanaInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHanaInstanceResponseBody getBody() {
        return this.body;
    }

}
