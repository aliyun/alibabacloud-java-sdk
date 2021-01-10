// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSceneRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSceneRuleResponseBody body;

    public static GetSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneRuleResponse self = new GetSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneRuleResponse setBody(GetSceneRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneRuleResponseBody getBody() {
        return this.body;
    }

}
