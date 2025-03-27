// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWafRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWafRuleResponseBody body;

    public static UpdateWafRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWafRuleResponse self = new UpdateWafRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWafRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWafRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWafRuleResponse setBody(UpdateWafRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWafRuleResponseBody getBody() {
        return this.body;
    }

}
