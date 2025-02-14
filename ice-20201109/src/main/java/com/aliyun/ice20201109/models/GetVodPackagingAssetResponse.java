// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVodPackagingAssetResponseBody body;

    public static GetVodPackagingAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingAssetResponse self = new GetVodPackagingAssetResponse();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVodPackagingAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVodPackagingAssetResponse setBody(GetVodPackagingAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVodPackagingAssetResponseBody getBody() {
        return this.body;
    }

}
