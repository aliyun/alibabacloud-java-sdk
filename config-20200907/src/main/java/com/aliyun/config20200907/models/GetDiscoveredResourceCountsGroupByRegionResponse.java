// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiscoveredResourceCountsGroupByRegionResponseBody body;

    public static GetDiscoveredResourceCountsGroupByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsGroupByRegionResponse self = new GetDiscoveredResourceCountsGroupByRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsGroupByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiscoveredResourceCountsGroupByRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiscoveredResourceCountsGroupByRegionResponse setBody(GetDiscoveredResourceCountsGroupByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiscoveredResourceCountsGroupByRegionResponseBody getBody() {
        return this.body;
    }

}
