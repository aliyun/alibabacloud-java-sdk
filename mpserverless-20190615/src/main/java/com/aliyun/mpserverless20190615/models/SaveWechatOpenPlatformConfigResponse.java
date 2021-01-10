// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWechatOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveWechatOpenPlatformConfigResponseBody body;

    public static SaveWechatOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveWechatOpenPlatformConfigResponse self = new SaveWechatOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveWechatOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveWechatOpenPlatformConfigResponse setBody(SaveWechatOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveWechatOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
