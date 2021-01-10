// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowConnectionsResponseBody body;

    public static ListFlowConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowConnectionsResponse self = new ListFlowConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowConnectionsResponse setBody(ListFlowConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowConnectionsResponseBody getBody() {
        return this.body;
    }

}
