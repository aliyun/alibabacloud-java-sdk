// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRegionResponseBody body;

    public static GetRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionResponse self = new GetRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegionResponse setBody(GetRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegionResponseBody getBody() {
        return this.body;
    }

}
