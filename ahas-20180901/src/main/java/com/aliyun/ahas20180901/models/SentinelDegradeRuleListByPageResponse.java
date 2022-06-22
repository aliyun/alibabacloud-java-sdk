// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleListByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleListByPageResponseBody body;

    public static SentinelDegradeRuleListByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleListByPageResponse self = new SentinelDegradeRuleListByPageResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleListByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleListByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleListByPageResponse setBody(SentinelDegradeRuleListByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleListByPageResponseBody getBody() {
        return this.body;
    }

}
