// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteVodPackagingAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVodPackagingAssetResponseBody body;

    public static DeleteVodPackagingAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodPackagingAssetResponse self = new DeleteVodPackagingAssetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVodPackagingAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVodPackagingAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVodPackagingAssetResponse setBody(DeleteVodPackagingAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodPackagingAssetResponseBody getBody() {
        return this.body;
    }

}
