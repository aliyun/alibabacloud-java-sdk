// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBrowsersResult body;

    public static ListBrowsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBrowsersResponse self = new ListBrowsersResponse();
        return TeaModel.build(map, self);
    }

    public ListBrowsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBrowsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBrowsersResponse setBody(ListBrowsersResult body) {
        this.body = body;
        return this;
    }
    public ListBrowsersResult getBody() {
        return this.body;
    }

}
