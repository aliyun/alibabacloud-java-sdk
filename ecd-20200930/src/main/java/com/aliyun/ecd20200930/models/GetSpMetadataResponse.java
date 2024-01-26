// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetSpMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpMetadataResponseBody body;

    public static GetSpMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpMetadataResponse self = new GetSpMetadataResponse();
        return TeaModel.build(map, self);
    }

    public GetSpMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpMetadataResponse setBody(GetSpMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpMetadataResponseBody getBody() {
        return this.body;
    }

}
