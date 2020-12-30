// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteMultiZoneClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMultiZoneClusterResponseBody body;

    public static DeleteMultiZoneClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiZoneClusterResponse self = new DeleteMultiZoneClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultiZoneClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultiZoneClusterResponse setBody(DeleteMultiZoneClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

}
