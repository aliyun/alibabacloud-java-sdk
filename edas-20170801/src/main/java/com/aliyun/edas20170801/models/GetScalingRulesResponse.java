// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetScalingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScalingRulesResponse setBody(GetScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScalingRulesResponseBody getBody() {
        return this.body;
    }

}
