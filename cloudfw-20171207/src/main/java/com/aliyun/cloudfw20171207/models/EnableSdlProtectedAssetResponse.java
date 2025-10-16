// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class EnableSdlProtectedAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSdlProtectedAssetResponseBody body;

    public static EnableSdlProtectedAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSdlProtectedAssetResponse self = new EnableSdlProtectedAssetResponse();
        return TeaModel.build(map, self);
    }

    public EnableSdlProtectedAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSdlProtectedAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSdlProtectedAssetResponse setBody(EnableSdlProtectedAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSdlProtectedAssetResponseBody getBody() {
        return this.body;
    }

}
