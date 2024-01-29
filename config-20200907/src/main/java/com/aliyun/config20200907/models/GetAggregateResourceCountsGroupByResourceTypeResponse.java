// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateResourceCountsGroupByResourceTypeResponseBody body;

    public static GetAggregateResourceCountsGroupByResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByResourceTypeResponse self = new GetAggregateResourceCountsGroupByResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceCountsGroupByResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceCountsGroupByResourceTypeResponse setBody(GetAggregateResourceCountsGroupByResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceCountsGroupByResourceTypeResponseBody getBody() {
        return this.body;
    }

}
