// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchCreateVodPackagingAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateVodPackagingAssetResponseBody body;

    public static BatchCreateVodPackagingAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateVodPackagingAssetResponse self = new BatchCreateVodPackagingAssetResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateVodPackagingAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateVodPackagingAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateVodPackagingAssetResponse setBody(BatchCreateVodPackagingAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateVodPackagingAssetResponseBody getBody() {
        return this.body;
    }

}
