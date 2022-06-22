// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHotParamRuleOffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelHotParamRuleOffResponseBody body;

    public static SentinelHotParamRuleOffResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelHotParamRuleOffResponse self = new SentinelHotParamRuleOffResponse();
        return TeaModel.build(map, self);
    }

    public SentinelHotParamRuleOffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelHotParamRuleOffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelHotParamRuleOffResponse setBody(SentinelHotParamRuleOffResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelHotParamRuleOffResponseBody getBody() {
        return this.body;
    }

}
