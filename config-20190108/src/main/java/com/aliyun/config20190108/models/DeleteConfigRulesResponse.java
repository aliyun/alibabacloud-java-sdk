// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DeleteConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConfigRulesResponseBody body;

    public static DeleteConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigRulesResponse self = new DeleteConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigRulesResponse setBody(DeleteConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigRulesResponseBody getBody() {
        return this.body;
    }

}
