// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScalingRulesResponseBody body;

    public static GetScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScalingRulesResponse self = new GetScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScalingRulesResponse setBody(GetScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScalingRulesResponseBody getBody() {
        return this.body;
    }

}
