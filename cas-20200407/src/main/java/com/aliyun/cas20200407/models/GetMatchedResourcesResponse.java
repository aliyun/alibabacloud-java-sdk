// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetMatchedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMatchedResourcesResponseBody body;

    public static GetMatchedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMatchedResourcesResponse self = new GetMatchedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetMatchedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMatchedResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMatchedResourcesResponse setBody(GetMatchedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMatchedResourcesResponseBody getBody() {
        return this.body;
    }

}
