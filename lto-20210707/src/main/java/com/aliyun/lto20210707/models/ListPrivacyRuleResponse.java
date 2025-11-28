// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListPrivacyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivacyRuleResponseBody body;

    public static ListPrivacyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivacyRuleResponse self = new ListPrivacyRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivacyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivacyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivacyRuleResponse setBody(ListPrivacyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivacyRuleResponseBody getBody() {
        return this.body;
    }

}
