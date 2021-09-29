// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class UnRegisterApAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnRegisterApAssetResponseBody body;

    public static UnRegisterApAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterApAssetResponse self = new UnRegisterApAssetResponse();
        return TeaModel.build(map, self);
    }

    public UnRegisterApAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnRegisterApAssetResponse setBody(UnRegisterApAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public UnRegisterApAssetResponseBody getBody() {
        return this.body;
    }

}
