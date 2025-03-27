// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWafRulesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWafRulesetResponseBody body;

    public static CreateWafRulesetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWafRulesetResponse self = new CreateWafRulesetResponse();
        return TeaModel.build(map, self);
    }

    public CreateWafRulesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWafRulesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWafRulesetResponse setBody(CreateWafRulesetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWafRulesetResponseBody getBody() {
        return this.body;
    }

}
