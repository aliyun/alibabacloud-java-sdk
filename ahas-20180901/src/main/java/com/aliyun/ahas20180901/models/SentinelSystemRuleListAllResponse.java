// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleListAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelSystemRuleListAllResponseBody body;

    public static SentinelSystemRuleListAllResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleListAllResponse self = new SentinelSystemRuleListAllResponse();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleListAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelSystemRuleListAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelSystemRuleListAllResponse setBody(SentinelSystemRuleListAllResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelSystemRuleListAllResponseBody getBody() {
        return this.body;
    }

}
