// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteStorageDomainRoutingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStorageDomainRoutingRuleResponseBody body;

    public static DeleteStorageDomainRoutingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageDomainRoutingRuleResponse self = new DeleteStorageDomainRoutingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStorageDomainRoutingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStorageDomainRoutingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStorageDomainRoutingRuleResponse setBody(DeleteStorageDomainRoutingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStorageDomainRoutingRuleResponseBody getBody() {
        return this.body;
    }

}
