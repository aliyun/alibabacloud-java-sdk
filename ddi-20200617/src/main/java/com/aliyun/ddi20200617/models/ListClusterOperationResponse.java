// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClusterOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterOperationResponseBody body;

    public static ListClusterOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationResponse self = new ListClusterOperationResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterOperationResponse setBody(ListClusterOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterOperationResponseBody getBody() {
        return this.body;
    }

}
