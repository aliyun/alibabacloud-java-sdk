// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEventRulesResponseBody body;

    public static DeleteEventRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRulesResponse self = new DeleteEventRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventRulesResponse setBody(DeleteEventRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventRulesResponseBody getBody() {
        return this.body;
    }

}
