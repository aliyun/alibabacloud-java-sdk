// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateRuleActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRuleActionResponseBody body;

    public static UpdateRuleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleActionResponse self = new UpdateRuleActionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRuleActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRuleActionResponse setBody(UpdateRuleActionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleActionResponseBody getBody() {
        return this.body;
    }

}
