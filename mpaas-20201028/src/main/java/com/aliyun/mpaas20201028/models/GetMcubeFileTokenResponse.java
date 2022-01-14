// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeFileTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetMcubeFileTokenResponse setBody(GetMcubeFileTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcubeFileTokenResponseBody getBody() {
        return this.body;
    }

}
