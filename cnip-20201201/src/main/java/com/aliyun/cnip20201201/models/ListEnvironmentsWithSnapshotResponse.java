// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentsWithSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentsWithSnapshotResponseBody body;

    public static ListEnvironmentsWithSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsWithSnapshotResponse self = new ListEnvironmentsWithSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsWithSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentsWithSnapshotResponse setBody(ListEnvironmentsWithSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentsWithSnapshotResponseBody getBody() {
        return this.body;
    }

}
