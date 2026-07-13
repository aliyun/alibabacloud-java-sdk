// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteAtiRegistrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAtiRegistrantResponseBody body;

    public static DeleteAtiRegistrantResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAtiRegistrantResponse self = new DeleteAtiRegistrantResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAtiRegistrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAtiRegistrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAtiRegistrantResponse setBody(DeleteAtiRegistrantResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAtiRegistrantResponseBody getBody() {
        return this.body;
    }

}
