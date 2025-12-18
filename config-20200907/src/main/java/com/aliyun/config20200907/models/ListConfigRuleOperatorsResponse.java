// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleOperatorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConfigRuleOperatorsResponseBody body;

    public static ListConfigRuleOperatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRuleOperatorsResponse self = new ListConfigRuleOperatorsResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigRuleOperatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigRuleOperatorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigRuleOperatorsResponse setBody(ListConfigRuleOperatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigRuleOperatorsResponseBody getBody() {
        return this.body;
    }

}
