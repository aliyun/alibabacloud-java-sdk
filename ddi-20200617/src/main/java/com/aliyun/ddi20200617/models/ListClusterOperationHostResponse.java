// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClusterOperationHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterOperationHostResponseBody body;

    public static ListClusterOperationHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationHostResponse self = new ListClusterOperationHostResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterOperationHostResponse setBody(ListClusterOperationHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterOperationHostResponseBody getBody() {
        return this.body;
    }

}
