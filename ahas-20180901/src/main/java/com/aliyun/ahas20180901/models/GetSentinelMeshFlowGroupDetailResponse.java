// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSentinelMeshFlowGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSentinelMeshFlowGroupDetailResponseBody body;

    public static GetSentinelMeshFlowGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSentinelMeshFlowGroupDetailResponse self = new GetSentinelMeshFlowGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSentinelMeshFlowGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSentinelMeshFlowGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSentinelMeshFlowGroupDetailResponse setBody(GetSentinelMeshFlowGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSentinelMeshFlowGroupDetailResponseBody getBody() {
        return this.body;
    }

}
