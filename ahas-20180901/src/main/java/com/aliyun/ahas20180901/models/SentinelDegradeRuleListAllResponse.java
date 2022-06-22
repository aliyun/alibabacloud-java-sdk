// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleListAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleListAllResponseBody body;

    public static SentinelDegradeRuleListAllResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleListAllResponse self = new SentinelDegradeRuleListAllResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleListAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleListAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleListAllResponse setBody(SentinelDegradeRuleListAllResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleListAllResponseBody getBody() {
        return this.body;
    }

}
