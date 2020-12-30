// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetScenarioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScenarioResponseBody body;

    public static GetScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioResponse self = new GetScenarioResponse();
        return TeaModel.build(map, self);
    }

    public GetScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenarioResponse setBody(GetScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenarioResponseBody getBody() {
        return this.body;
    }

}
