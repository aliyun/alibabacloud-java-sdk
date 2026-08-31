// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComputeClusterResponseBody body;

    public static CreateComputeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeClusterResponse self = new CreateComputeClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeClusterResponse setBody(CreateComputeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeClusterResponseBody getBody() {
        return this.body;
    }

}
