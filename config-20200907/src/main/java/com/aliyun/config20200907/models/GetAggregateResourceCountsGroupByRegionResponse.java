// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateResourceCountsGroupByRegionResponseBody body;

    public static GetAggregateResourceCountsGroupByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByRegionResponse self = new GetAggregateResourceCountsGroupByRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceCountsGroupByRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceCountsGroupByRegionResponse setBody(GetAggregateResourceCountsGroupByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceCountsGroupByRegionResponseBody getBody() {
        return this.body;
    }

}
