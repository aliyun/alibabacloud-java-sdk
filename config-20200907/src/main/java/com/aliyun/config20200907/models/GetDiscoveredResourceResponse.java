// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDiscoveredResourceResponse setBody(GetDiscoveredResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiscoveredResourceResponseBody getBody() {
        return this.body;
    }

}
