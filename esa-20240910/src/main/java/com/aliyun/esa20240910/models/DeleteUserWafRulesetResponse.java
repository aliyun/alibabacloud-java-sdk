// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteUserWafRulesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserWafRulesetResponseBody body;

    public static DeleteUserWafRulesetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserWafRulesetResponse self = new DeleteUserWafRulesetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserWafRulesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserWafRulesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserWafRulesetResponse setBody(DeleteUserWafRulesetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserWafRulesetResponseBody getBody() {
        return this.body;
    }

}
