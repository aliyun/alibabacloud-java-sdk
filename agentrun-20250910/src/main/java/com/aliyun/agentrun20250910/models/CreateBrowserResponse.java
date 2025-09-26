// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateBrowserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BrowserResult body;

    public static CreateBrowserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBrowserResponse self = new CreateBrowserResponse();
        return TeaModel.build(map, self);
    }

    public CreateBrowserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBrowserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBrowserResponse setBody(BrowserResult body) {
        this.body = body;
        return this;
    }
    public BrowserResult getBody() {
        return this.body;
    }

}
