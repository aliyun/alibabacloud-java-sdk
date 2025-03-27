// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteWafRulesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWafRulesetResponseBody body;

    public static DeleteWafRulesetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWafRulesetResponse self = new DeleteWafRulesetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWafRulesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWafRulesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWafRulesetResponse setBody(DeleteWafRulesetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWafRulesetResponseBody getBody() {
        return this.body;
    }

}
