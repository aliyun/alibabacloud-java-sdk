// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHotParamRuleOnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelHotParamRuleOnResponseBody body;

    public static SentinelHotParamRuleOnResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelHotParamRuleOnResponse self = new SentinelHotParamRuleOnResponse();
        return TeaModel.build(map, self);
    }

    public SentinelHotParamRuleOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelHotParamRuleOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelHotParamRuleOnResponse setBody(SentinelHotParamRuleOnResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelHotParamRuleOnResponseBody getBody() {
        return this.body;
    }

}
