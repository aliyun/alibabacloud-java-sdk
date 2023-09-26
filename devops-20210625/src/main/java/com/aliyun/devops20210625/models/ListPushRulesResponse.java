// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPushRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPushRulesResponseBody body;

    public static ListPushRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPushRulesResponse self = new ListPushRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListPushRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPushRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPushRulesResponse setBody(ListPushRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPushRulesResponseBody getBody() {
        return this.body;
    }

}
