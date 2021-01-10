// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateDingtalkOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDingtalkOpenPlatformConfigResponseBody body;

    public static UpdateDingtalkOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDingtalkOpenPlatformConfigResponse self = new UpdateDingtalkOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDingtalkOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDingtalkOpenPlatformConfigResponse setBody(UpdateDingtalkOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDingtalkOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
