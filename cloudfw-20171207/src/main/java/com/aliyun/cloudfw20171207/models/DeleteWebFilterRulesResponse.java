// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteWebFilterRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebFilterRulesResponseBody body;

    public static DeleteWebFilterRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebFilterRulesResponse self = new DeleteWebFilterRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWebFilterRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebFilterRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebFilterRulesResponse setBody(DeleteWebFilterRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebFilterRulesResponseBody getBody() {
        return this.body;
    }

}
