// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVodPackagingAssetResponseBody body;

    public static CreateVodPackagingAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingAssetResponse self = new CreateVodPackagingAssetResponse();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVodPackagingAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVodPackagingAssetResponse setBody(CreateVodPackagingAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVodPackagingAssetResponseBody getBody() {
        return this.body;
    }

}
