// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDegradeRuleDeleteResponseBody body;

    public static SentinelDegradeRuleDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleDeleteResponse self = new SentinelDegradeRuleDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDegradeRuleDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDegradeRuleDeleteResponse setBody(SentinelDegradeRuleDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDegradeRuleDeleteResponseBody getBody() {
        return this.body;
    }

}
