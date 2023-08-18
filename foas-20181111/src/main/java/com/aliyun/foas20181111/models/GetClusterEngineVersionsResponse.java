// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterEngineVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterEngineVersionsResponseBody body;

    public static GetClusterEngineVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterEngineVersionsResponse self = new GetClusterEngineVersionsResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterEngineVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterEngineVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterEngineVersionsResponse setBody(GetClusterEngineVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterEngineVersionsResponseBody getBody() {
        return this.body;
    }

}
