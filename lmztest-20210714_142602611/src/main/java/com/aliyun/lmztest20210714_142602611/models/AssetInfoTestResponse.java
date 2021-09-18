// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611.models;

import com.aliyun.tea.*;

public class AssetInfoTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssetInfoTestResponseBody body;

    public static AssetInfoTestResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetInfoTestResponse self = new AssetInfoTestResponse();
        return TeaModel.build(map, self);
    }

    public AssetInfoTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssetInfoTestResponse setBody(AssetInfoTestResponseBody body) {
        this.body = body;
        return this;
    }
    public AssetInfoTestResponseBody getBody() {
        return this.body;
    }

}
