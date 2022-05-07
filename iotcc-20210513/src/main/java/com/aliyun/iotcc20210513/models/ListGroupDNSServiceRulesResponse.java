// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListGroupDNSServiceRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupDNSServiceRulesResponseBody body;

    public static ListGroupDNSServiceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupDNSServiceRulesResponse self = new ListGroupDNSServiceRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupDNSServiceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupDNSServiceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupDNSServiceRulesResponse setBody(ListGroupDNSServiceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupDNSServiceRulesResponseBody getBody() {
        return this.body;
    }

}
