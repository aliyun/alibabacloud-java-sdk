// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DeleteContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactsResponseBody body;

    public static DeleteContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactsResponse self = new DeleteContactsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactsResponse setBody(DeleteContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactsResponseBody getBody() {
        return this.body;
    }

}
