// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListPromClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPromClustersResponseBody body;

    public static ListPromClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPromClustersResponse self = new ListPromClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListPromClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPromClustersResponse setBody(ListPromClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPromClustersResponseBody getBody() {
        return this.body;
    }

}
