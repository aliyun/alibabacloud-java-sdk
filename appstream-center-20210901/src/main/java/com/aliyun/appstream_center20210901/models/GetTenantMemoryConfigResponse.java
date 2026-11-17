// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetTenantMemoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTenantMemoryConfigResponseBody body;

    public static GetTenantMemoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantMemoryConfigResponse self = new GetTenantMemoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantMemoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTenantMemoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTenantMemoryConfigResponse setBody(GetTenantMemoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTenantMemoryConfigResponseBody getBody() {
        return this.body;
    }

}
