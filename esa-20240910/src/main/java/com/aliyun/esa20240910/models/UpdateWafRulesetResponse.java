// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWafRulesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWafRulesetResponseBody body;

    public static UpdateWafRulesetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWafRulesetResponse self = new UpdateWafRulesetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWafRulesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWafRulesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWafRulesetResponse setBody(UpdateWafRulesetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWafRulesetResponseBody getBody() {
        return this.body;
    }

}
