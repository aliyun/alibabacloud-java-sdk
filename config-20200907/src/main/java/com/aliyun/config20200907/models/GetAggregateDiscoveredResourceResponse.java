// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateDiscoveredResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateDiscoveredResourceResponseBody body;

    public static GetAggregateDiscoveredResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateDiscoveredResourceResponse self = new GetAggregateDiscoveredResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateDiscoveredResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateDiscoveredResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateDiscoveredResourceResponse setBody(GetAggregateDiscoveredResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateDiscoveredResourceResponseBody getBody() {
        return this.body;
    }

}
