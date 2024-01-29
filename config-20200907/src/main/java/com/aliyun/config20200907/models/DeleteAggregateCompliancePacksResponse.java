// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateCompliancePacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAggregateCompliancePacksResponseBody body;

    public static DeleteAggregateCompliancePacksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateCompliancePacksResponse self = new DeleteAggregateCompliancePacksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateCompliancePacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAggregateCompliancePacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAggregateCompliancePacksResponse setBody(DeleteAggregateCompliancePacksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAggregateCompliancePacksResponseBody getBody() {
        return this.body;
    }

}
