// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteBrowserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBrowserResult body;

    public static DeleteBrowserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBrowserResponse self = new DeleteBrowserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBrowserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBrowserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBrowserResponse setBody(DeleteBrowserResult body) {
        this.body = body;
        return this;
    }
    public DeleteBrowserResult getBody() {
        return this.body;
    }

}
