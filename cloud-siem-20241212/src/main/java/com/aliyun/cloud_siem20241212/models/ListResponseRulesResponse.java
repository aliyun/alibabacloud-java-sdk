// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListResponseRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResponseRulesResponseBody body;

    public static ListResponseRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResponseRulesResponse self = new ListResponseRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListResponseRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResponseRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResponseRulesResponse setBody(ListResponseRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResponseRulesResponseBody getBody() {
        return this.body;
    }

}
