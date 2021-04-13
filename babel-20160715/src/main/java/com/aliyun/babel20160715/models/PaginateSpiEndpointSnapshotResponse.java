// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class PaginateSpiEndpointSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PaginateSpiEndpointSnapshotResponseBody body;

    public static PaginateSpiEndpointSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        PaginateSpiEndpointSnapshotResponse self = new PaginateSpiEndpointSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public PaginateSpiEndpointSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PaginateSpiEndpointSnapshotResponse setBody(PaginateSpiEndpointSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public PaginateSpiEndpointSnapshotResponseBody getBody() {
        return this.body;
    }

}
