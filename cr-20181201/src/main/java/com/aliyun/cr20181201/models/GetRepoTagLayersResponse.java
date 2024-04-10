// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagLayersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepoTagLayersResponseBody body;

    public static GetRepoTagLayersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagLayersResponse self = new GetRepoTagLayersResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoTagLayersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoTagLayersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepoTagLayersResponse setBody(GetRepoTagLayersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoTagLayersResponseBody getBody() {
        return this.body;
    }

}
