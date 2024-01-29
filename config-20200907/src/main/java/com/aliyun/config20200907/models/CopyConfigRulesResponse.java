// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyConfigRulesResponseBody body;

    public static CopyConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyConfigRulesResponse self = new CopyConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public CopyConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyConfigRulesResponse setBody(CopyConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyConfigRulesResponseBody getBody() {
        return this.body;
    }

}
