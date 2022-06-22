// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelSystemRuleDeleteResponseBody body;

    public static SentinelSystemRuleDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleDeleteResponse self = new SentinelSystemRuleDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelSystemRuleDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelSystemRuleDeleteResponse setBody(SentinelSystemRuleDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelSystemRuleDeleteResponseBody getBody() {
        return this.body;
    }

}
