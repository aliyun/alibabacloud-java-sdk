// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCacheRulesResponseBody body;

    public static ListCacheRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCacheRulesResponse self = new ListCacheRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListCacheRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCacheRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCacheRulesResponse setBody(ListCacheRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCacheRulesResponseBody getBody() {
        return this.body;
    }

}
