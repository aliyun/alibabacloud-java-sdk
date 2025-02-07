// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOriginRulesResponseBody body;

    public static ListOriginRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOriginRulesResponse self = new ListOriginRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListOriginRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOriginRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOriginRulesResponse setBody(ListOriginRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOriginRulesResponseBody getBody() {
        return this.body;
    }

}
