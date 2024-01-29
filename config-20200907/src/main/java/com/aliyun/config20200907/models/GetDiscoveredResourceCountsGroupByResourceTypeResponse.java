// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiscoveredResourceCountsGroupByResourceTypeResponseBody body;

    public static GetDiscoveredResourceCountsGroupByResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsGroupByResourceTypeResponse self = new GetDiscoveredResourceCountsGroupByResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsGroupByResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiscoveredResourceCountsGroupByResourceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiscoveredResourceCountsGroupByResourceTypeResponse setBody(GetDiscoveredResourceCountsGroupByResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiscoveredResourceCountsGroupByResourceTypeResponseBody getBody() {
        return this.body;
    }

}
