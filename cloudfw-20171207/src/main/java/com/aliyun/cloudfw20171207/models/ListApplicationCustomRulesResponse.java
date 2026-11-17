// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationCustomRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationCustomRulesResponseBody body;

    public static ListApplicationCustomRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationCustomRulesResponse self = new ListApplicationCustomRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationCustomRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationCustomRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationCustomRulesResponse setBody(ListApplicationCustomRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationCustomRulesResponseBody getBody() {
        return this.body;
    }

}
