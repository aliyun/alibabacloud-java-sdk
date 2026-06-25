// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerQuotaRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumerQuotaRulesResponseBody body;

    public static ListConsumerQuotaRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerQuotaRulesResponse self = new ListConsumerQuotaRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerQuotaRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerQuotaRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerQuotaRulesResponse setBody(ListConsumerQuotaRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerQuotaRulesResponseBody getBody() {
        return this.body;
    }

}
