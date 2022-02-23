// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateDiscoveredResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAggregateDiscoveredResourcesResponseBody body;

    public static ListAggregateDiscoveredResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateDiscoveredResourcesResponse self = new ListAggregateDiscoveredResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateDiscoveredResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateDiscoveredResourcesResponse setBody(ListAggregateDiscoveredResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateDiscoveredResourcesResponseBody getBody() {
        return this.body;
    }

}
