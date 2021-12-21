// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowEntitySnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowEntitySnapshotResponseBody body;

    public static ListFlowEntitySnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowEntitySnapshotResponse self = new ListFlowEntitySnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowEntitySnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowEntitySnapshotResponse setBody(ListFlowEntitySnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowEntitySnapshotResponseBody getBody() {
        return this.body;
    }

}
