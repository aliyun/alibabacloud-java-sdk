// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListToolsResult body;

    public static ListToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListToolsResponse self = new ListToolsResponse();
        return TeaModel.build(map, self);
    }

    public ListToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListToolsResponse setBody(ListToolsResult body) {
        this.body = body;
        return this;
    }
    public ListToolsResult getBody() {
        return this.body;
    }

}
