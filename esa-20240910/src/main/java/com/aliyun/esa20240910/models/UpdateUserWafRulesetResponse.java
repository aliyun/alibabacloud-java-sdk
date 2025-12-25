// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUserWafRulesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserWafRulesetResponseBody body;

    public static UpdateUserWafRulesetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserWafRulesetResponse self = new UpdateUserWafRulesetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserWafRulesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserWafRulesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserWafRulesetResponse setBody(UpdateUserWafRulesetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserWafRulesetResponseBody getBody() {
        return this.body;
    }

}
