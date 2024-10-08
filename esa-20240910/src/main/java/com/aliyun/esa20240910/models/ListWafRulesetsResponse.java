// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWafRulesetsResponseBody body;

    public static ListWafRulesetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWafRulesetsResponse self = new ListWafRulesetsResponse();
        return TeaModel.build(map, self);
    }

    public ListWafRulesetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWafRulesetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWafRulesetsResponse setBody(ListWafRulesetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWafRulesetsResponseBody getBody() {
        return this.body;
    }

}
