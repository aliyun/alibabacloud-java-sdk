// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteContactsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactsNewResponseBody body;

    public static DeleteContactsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactsNewResponse self = new DeleteContactsNewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactsNewResponse setBody(DeleteContactsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactsNewResponseBody getBody() {
        return this.body;
    }

}
