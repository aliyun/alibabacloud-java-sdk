// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListWebFilterRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebFilterRulesResponseBody body;

    public static ListWebFilterRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebFilterRulesResponse self = new ListWebFilterRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListWebFilterRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebFilterRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebFilterRulesResponse setBody(ListWebFilterRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWebFilterRulesResponseBody getBody() {
        return this.body;
    }

}
