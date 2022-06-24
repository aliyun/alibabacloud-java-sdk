// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class GetMcubeNebulaResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMcubeNebulaResourceResponseBody body;

    public static GetMcubeNebulaResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeNebulaResourceResponse self = new GetMcubeNebulaResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetMcubeNebulaResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcubeNebulaResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcubeNebulaResourceResponse setBody(GetMcubeNebulaResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcubeNebulaResourceResponseBody getBody() {
        return this.body;
    }

}
