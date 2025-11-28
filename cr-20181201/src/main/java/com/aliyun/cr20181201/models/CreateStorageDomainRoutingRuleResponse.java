// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateStorageDomainRoutingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStorageDomainRoutingRuleResponseBody body;

    public static CreateStorageDomainRoutingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageDomainRoutingRuleResponse self = new CreateStorageDomainRoutingRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageDomainRoutingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStorageDomainRoutingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStorageDomainRoutingRuleResponse setBody(CreateStorageDomainRoutingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStorageDomainRoutingRuleResponseBody getBody() {
        return this.body;
    }

}
