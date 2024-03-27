// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDesensitizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDesensitizationRuleResponseBody body;

    public static ListDesensitizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDesensitizationRuleResponse self = new ListDesensitizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListDesensitizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDesensitizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDesensitizationRuleResponse setBody(ListDesensitizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDesensitizationRuleResponseBody getBody() {
        return this.body;
    }

}
