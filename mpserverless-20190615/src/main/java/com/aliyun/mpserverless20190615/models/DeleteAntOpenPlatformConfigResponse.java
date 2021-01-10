// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteAntOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAntOpenPlatformConfigResponseBody body;

    public static DeleteAntOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntOpenPlatformConfigResponse self = new DeleteAntOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAntOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAntOpenPlatformConfigResponse setBody(DeleteAntOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
