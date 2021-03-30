// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApAssetResponseBody body;

    public static GetApAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApAssetResponse self = new GetApAssetResponse();
        return TeaModel.build(map, self);
    }

    public GetApAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApAssetResponse setBody(GetApAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApAssetResponseBody getBody() {
        return this.body;
    }

}
