// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpIncomingResponseHeaderModificationRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHttpIncomingResponseHeaderModificationRulesResponseBody body;

    public static ListHttpIncomingResponseHeaderModificationRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHttpIncomingResponseHeaderModificationRulesResponse self = new ListHttpIncomingResponseHeaderModificationRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponse setBody(ListHttpIncomingResponseHeaderModificationRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHttpIncomingResponseHeaderModificationRulesResponseBody getBody() {
        return this.body;
    }

}
