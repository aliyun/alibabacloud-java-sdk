// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteIsolationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIsolationRulesResponseBody body;

    public static DeleteIsolationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIsolationRulesResponse self = new DeleteIsolationRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIsolationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIsolationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIsolationRulesResponse setBody(DeleteIsolationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIsolationRulesResponseBody getBody() {
        return this.body;
    }

}
