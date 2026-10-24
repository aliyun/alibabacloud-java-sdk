// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class ListSystemConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSystemConfigRulesResponseBody body;

    public static ListSystemConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemConfigRulesResponse self = new ListSystemConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemConfigRulesResponse setBody(ListSystemConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemConfigRulesResponseBody getBody() {
        return this.body;
    }

}
