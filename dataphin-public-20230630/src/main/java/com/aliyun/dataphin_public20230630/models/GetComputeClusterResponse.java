// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetComputeClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeClusterResponseBody body;

    public static GetComputeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeClusterResponse self = new GetComputeClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeClusterResponse setBody(GetComputeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeClusterResponseBody getBody() {
        return this.body;
    }

}
