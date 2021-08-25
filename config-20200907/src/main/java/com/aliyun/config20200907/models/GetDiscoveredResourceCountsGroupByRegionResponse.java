// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDiscoveredResourceCountsGroupByRegionResponse setBody(GetDiscoveredResourceCountsGroupByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiscoveredResourceCountsGroupByRegionResponseBody getBody() {
        return this.body;
    }

}
