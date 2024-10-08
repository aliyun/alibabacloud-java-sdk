// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWafRulesResponseBody body;

    public static ListWafRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWafRulesResponse self = new ListWafRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListWafRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWafRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWafRulesResponse setBody(ListWafRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWafRulesResponseBody getBody() {
        return this.body;
    }

}
