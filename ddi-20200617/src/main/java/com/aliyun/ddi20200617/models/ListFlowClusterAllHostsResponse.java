// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowClusterAllHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowClusterAllHostsResponseBody body;

    public static ListFlowClusterAllHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterAllHostsResponse self = new ListFlowClusterAllHostsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterAllHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowClusterAllHostsResponse setBody(ListFlowClusterAllHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowClusterAllHostsResponseBody getBody() {
        return this.body;
    }

}
