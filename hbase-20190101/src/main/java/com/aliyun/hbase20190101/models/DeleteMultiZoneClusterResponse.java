// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteMultiZoneClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteMultiZoneClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultiZoneClusterResponse setBody(DeleteMultiZoneClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultiZoneClusterResponseBody getBody() {
        return this.body;
    }

}
