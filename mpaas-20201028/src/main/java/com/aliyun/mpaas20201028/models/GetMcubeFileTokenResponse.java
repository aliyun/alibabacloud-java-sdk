// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeFileTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMcubeFileTokenResponseBody body;

    public static GetMcubeFileTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeFileTokenResponse self = new GetMcubeFileTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetMcubeFileTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcubeFileTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcubeFileTokenResponse setBody(GetMcubeFileTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcubeFileTokenResponseBody getBody() {
        return this.body;
    }

}
