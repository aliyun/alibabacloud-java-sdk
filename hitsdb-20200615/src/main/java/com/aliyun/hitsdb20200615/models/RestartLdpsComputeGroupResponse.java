// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class RestartLdpsComputeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartLdpsComputeGroupResponseBody body;

    public static RestartLdpsComputeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartLdpsComputeGroupResponse self = new RestartLdpsComputeGroupResponse();
        return TeaModel.build(map, self);
    }

    public RestartLdpsComputeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartLdpsComputeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartLdpsComputeGroupResponse setBody(RestartLdpsComputeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartLdpsComputeGroupResponseBody getBody() {
        return this.body;
    }

}
