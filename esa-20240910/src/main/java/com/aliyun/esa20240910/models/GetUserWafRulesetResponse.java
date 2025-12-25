// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserWafRulesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserWafRulesetResponseBody body;

    public static GetUserWafRulesetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserWafRulesetResponse self = new GetUserWafRulesetResponse();
        return TeaModel.build(map, self);
    }

    public GetUserWafRulesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserWafRulesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserWafRulesetResponse setBody(GetUserWafRulesetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserWafRulesetResponseBody getBody() {
        return this.body;
    }

}
