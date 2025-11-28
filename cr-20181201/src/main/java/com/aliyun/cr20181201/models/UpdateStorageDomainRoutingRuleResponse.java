// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateStorageDomainRoutingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStorageDomainRoutingRuleResponseBody body;

    public static UpdateStorageDomainRoutingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStorageDomainRoutingRuleResponse self = new UpdateStorageDomainRoutingRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStorageDomainRoutingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStorageDomainRoutingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStorageDomainRoutingRuleResponse setBody(UpdateStorageDomainRoutingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStorageDomainRoutingRuleResponseBody getBody() {
        return this.body;
    }

}
