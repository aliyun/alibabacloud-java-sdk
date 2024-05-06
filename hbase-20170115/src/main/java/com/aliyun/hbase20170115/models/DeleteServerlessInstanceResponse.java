// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DeleteServerlessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServerlessInstanceResponseBody body;

    public static DeleteServerlessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerlessInstanceResponse self = new DeleteServerlessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServerlessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServerlessInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServerlessInstanceResponse setBody(DeleteServerlessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServerlessInstanceResponseBody getBody() {
        return this.body;
    }

}
