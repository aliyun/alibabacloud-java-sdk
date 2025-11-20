// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelProxiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelProxiesResult body;

    public static ListModelProxiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelProxiesResponse self = new ListModelProxiesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelProxiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelProxiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelProxiesResponse setBody(ListModelProxiesResult body) {
        this.body = body;
        return this;
    }
    public ListModelProxiesResult getBody() {
        return this.body;
    }

}
