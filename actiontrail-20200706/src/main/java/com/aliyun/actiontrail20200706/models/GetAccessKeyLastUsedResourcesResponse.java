// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessKeyLastUsedResourcesResponseBody body;

    public static GetAccessKeyLastUsedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResourcesResponse self = new GetAccessKeyLastUsedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyLastUsedResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessKeyLastUsedResourcesResponse setBody(GetAccessKeyLastUsedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyLastUsedResourcesResponseBody getBody() {
        return this.body;
    }

}
