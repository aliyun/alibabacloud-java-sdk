// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleListRulesOfResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleListRulesOfResourceResponseBody body;

    public static SentinelDegradeRuleListRulesOfResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleListRulesOfResourceResponse self = new SentinelDegradeRuleListRulesOfResourceResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleListRulesOfResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleListRulesOfResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleListRulesOfResourceResponse setBody(SentinelDegradeRuleListRulesOfResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleListRulesOfResourceResponseBody getBody() {
        return this.body;
    }

}
