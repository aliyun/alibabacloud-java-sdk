// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDiscoveredResourceCountsGroupByResourceTypeResponse setBody(GetDiscoveredResourceCountsGroupByResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiscoveredResourceCountsGroupByResourceTypeResponseBody getBody() {
        return this.body;
    }

}
