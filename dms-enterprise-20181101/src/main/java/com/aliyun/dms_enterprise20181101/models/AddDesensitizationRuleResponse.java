// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddDesensitizationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDesensitizationRuleResponseBody body;

    public static AddDesensitizationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDesensitizationRuleResponse self = new AddDesensitizationRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddDesensitizationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDesensitizationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDesensitizationRuleResponse setBody(AddDesensitizationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDesensitizationRuleResponseBody getBody() {
        return this.body;
    }

}
