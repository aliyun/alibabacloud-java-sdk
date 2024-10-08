// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafRulesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWafRulesetResponseBody body;

    public static GetWafRulesetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWafRulesetResponse self = new GetWafRulesetResponse();
        return TeaModel.build(map, self);
    }

    public GetWafRulesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWafRulesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWafRulesetResponse setBody(GetWafRulesetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWafRulesetResponseBody getBody() {
        return this.body;
    }

}
