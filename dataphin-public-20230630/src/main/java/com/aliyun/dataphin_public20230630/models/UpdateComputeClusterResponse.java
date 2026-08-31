// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateComputeClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeClusterResponseBody body;

    public static UpdateComputeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeClusterResponse self = new UpdateComputeClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeClusterResponse setBody(UpdateComputeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeClusterResponseBody getBody() {
        return this.body;
    }

}
