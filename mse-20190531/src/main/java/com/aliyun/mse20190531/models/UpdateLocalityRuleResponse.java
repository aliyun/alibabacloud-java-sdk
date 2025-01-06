// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateLocalityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLocalityRuleResponseBody body;

    public static UpdateLocalityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocalityRuleResponse self = new UpdateLocalityRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLocalityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLocalityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLocalityRuleResponse setBody(UpdateLocalityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLocalityRuleResponseBody getBody() {
        return this.body;
    }

}
