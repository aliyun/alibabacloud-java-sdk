// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpResponseHeaderModificationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHttpResponseHeaderModificationRulesResponseBody body;

    public static ListHttpResponseHeaderModificationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHttpResponseHeaderModificationRulesResponse self = new ListHttpResponseHeaderModificationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListHttpResponseHeaderModificationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHttpResponseHeaderModificationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHttpResponseHeaderModificationRulesResponse setBody(ListHttpResponseHeaderModificationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHttpResponseHeaderModificationRulesResponseBody getBody() {
        return this.body;
    }

}
