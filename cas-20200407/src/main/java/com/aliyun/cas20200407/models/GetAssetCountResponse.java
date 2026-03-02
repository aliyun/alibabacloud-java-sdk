// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetAssetCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetCountResponseBody body;

    public static GetAssetCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetCountResponse self = new GetAssetCountResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetCountResponse setBody(GetAssetCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetCountResponseBody getBody() {
        return this.body;
    }

}
