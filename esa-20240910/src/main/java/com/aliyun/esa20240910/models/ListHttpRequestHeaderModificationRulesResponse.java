// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpRequestHeaderModificationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHttpRequestHeaderModificationRulesResponseBody body;

    public static ListHttpRequestHeaderModificationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHttpRequestHeaderModificationRulesResponse self = new ListHttpRequestHeaderModificationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListHttpRequestHeaderModificationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHttpRequestHeaderModificationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHttpRequestHeaderModificationRulesResponse setBody(ListHttpRequestHeaderModificationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHttpRequestHeaderModificationRulesResponseBody getBody() {
        return this.body;
    }

}
