// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWechatOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWechatOpenPlatformConfigResponseBody body;

    public static DeleteWechatOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWechatOpenPlatformConfigResponse self = new DeleteWechatOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWechatOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWechatOpenPlatformConfigResponse setBody(DeleteWechatOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWechatOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
