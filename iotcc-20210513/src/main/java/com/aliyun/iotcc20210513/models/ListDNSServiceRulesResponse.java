// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListDNSServiceRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDNSServiceRulesResponseBody body;

    public static ListDNSServiceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDNSServiceRulesResponse self = new ListDNSServiceRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListDNSServiceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDNSServiceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDNSServiceRulesResponse setBody(ListDNSServiceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDNSServiceRulesResponseBody getBody() {
        return this.body;
    }

}
