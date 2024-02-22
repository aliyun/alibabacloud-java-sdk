// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactResponseBody body;

    public static DeleteContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactResponse self = new DeleteContactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactResponse setBody(DeleteContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactResponseBody getBody() {
        return this.body;
    }

}
