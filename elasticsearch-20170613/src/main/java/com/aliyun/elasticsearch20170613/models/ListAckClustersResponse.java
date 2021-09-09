// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAckClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAckClustersResponseBody body;

    public static ListAckClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAckClustersResponse self = new ListAckClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListAckClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAckClustersResponse setBody(ListAckClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAckClustersResponseBody getBody() {
        return this.body;
    }

}
