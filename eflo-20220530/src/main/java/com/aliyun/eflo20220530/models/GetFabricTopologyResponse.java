// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetFabricTopologyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFabricTopologyResponseBody body;

    public static GetFabricTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFabricTopologyResponse self = new GetFabricTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetFabricTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFabricTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFabricTopologyResponse setBody(GetFabricTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFabricTopologyResponseBody getBody() {
        return this.body;
    }

}
