// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerGroupQuotaRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumerGroupQuotaRulesResponseBody body;

    public static ListConsumerGroupQuotaRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupQuotaRulesResponse self = new ListConsumerGroupQuotaRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupQuotaRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerGroupQuotaRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerGroupQuotaRulesResponse setBody(ListConsumerGroupQuotaRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerGroupQuotaRulesResponseBody getBody() {
        return this.body;
    }

}
