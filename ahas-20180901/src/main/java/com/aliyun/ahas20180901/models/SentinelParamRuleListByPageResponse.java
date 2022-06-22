// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelParamRuleListByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelParamRuleListByPageResponseBody body;

    public static SentinelParamRuleListByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelParamRuleListByPageResponse self = new SentinelParamRuleListByPageResponse();
        return TeaModel.build(map, self);
    }

    public SentinelParamRuleListByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelParamRuleListByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelParamRuleListByPageResponse setBody(SentinelParamRuleListByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelParamRuleListByPageResponseBody getBody() {
        return this.body;
    }

}
