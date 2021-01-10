// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAntOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveAntOpenPlatformConfigResponseBody body;

    public static SaveAntOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAntOpenPlatformConfigResponse self = new SaveAntOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveAntOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAntOpenPlatformConfigResponse setBody(SaveAntOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAntOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
