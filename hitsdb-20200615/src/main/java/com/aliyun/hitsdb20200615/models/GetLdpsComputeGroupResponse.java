// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLdpsComputeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLdpsComputeGroupResponseBody body;

    public static GetLdpsComputeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLdpsComputeGroupResponse self = new GetLdpsComputeGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLdpsComputeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLdpsComputeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLdpsComputeGroupResponse setBody(GetLdpsComputeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLdpsComputeGroupResponseBody getBody() {
        return this.body;
    }

}
