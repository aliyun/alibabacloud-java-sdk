// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentNodesResponseBody body;

    public static ListEnvironmentNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentNodesResponse self = new ListEnvironmentNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentNodesResponse setBody(ListEnvironmentNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentNodesResponseBody getBody() {
        return this.body;
    }

}
