// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiscoveredResourceResponseBody body;

    public static GetDiscoveredResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceResponse self = new GetDiscoveredResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiscoveredResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiscoveredResourceResponse setBody(GetDiscoveredResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiscoveredResourceResponseBody getBody() {
        return this.body;
    }

}
