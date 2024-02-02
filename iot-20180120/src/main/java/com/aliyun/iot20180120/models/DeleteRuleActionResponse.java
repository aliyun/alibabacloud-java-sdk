// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteRuleActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRuleActionResponseBody body;

    public static DeleteRuleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleActionResponse self = new DeleteRuleActionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRuleActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRuleActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRuleActionResponse setBody(DeleteRuleActionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRuleActionResponseBody getBody() {
        return this.body;
    }

}
