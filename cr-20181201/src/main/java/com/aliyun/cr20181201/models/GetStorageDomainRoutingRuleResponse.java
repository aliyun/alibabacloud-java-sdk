// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetStorageDomainRoutingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStorageDomainRoutingRuleResponseBody body;

    public static GetStorageDomainRoutingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStorageDomainRoutingRuleResponse self = new GetStorageDomainRoutingRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetStorageDomainRoutingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStorageDomainRoutingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStorageDomainRoutingRuleResponse setBody(GetStorageDomainRoutingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStorageDomainRoutingRuleResponseBody getBody() {
        return this.body;
    }

}
