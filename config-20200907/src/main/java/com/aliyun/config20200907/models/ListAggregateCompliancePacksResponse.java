// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateCompliancePacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAggregateCompliancePacksResponseBody body;

    public static ListAggregateCompliancePacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateCompliancePacksResponse self = new ListAggregateCompliancePacksResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateCompliancePacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateCompliancePacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateCompliancePacksResponse setBody(ListAggregateCompliancePacksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateCompliancePacksResponseBody getBody() {
        return this.body;
    }

}
