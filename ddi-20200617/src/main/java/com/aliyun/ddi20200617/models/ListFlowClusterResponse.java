// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowClusterResponseBody body;

    public static ListFlowClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterResponse self = new ListFlowClusterResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowClusterResponse setBody(ListFlowClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowClusterResponseBody getBody() {
        return this.body;
    }

}
