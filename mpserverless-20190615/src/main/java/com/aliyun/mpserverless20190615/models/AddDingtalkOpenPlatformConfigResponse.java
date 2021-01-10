// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AddDingtalkOpenPlatformConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDingtalkOpenPlatformConfigResponseBody body;

    public static AddDingtalkOpenPlatformConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDingtalkOpenPlatformConfigResponse self = new AddDingtalkOpenPlatformConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddDingtalkOpenPlatformConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDingtalkOpenPlatformConfigResponse setBody(AddDingtalkOpenPlatformConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDingtalkOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

}
