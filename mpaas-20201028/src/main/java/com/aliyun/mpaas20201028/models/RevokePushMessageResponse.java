// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RevokePushMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokePushMessageResponseBody body;

    public static RevokePushMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokePushMessageResponse self = new RevokePushMessageResponse();
        return TeaModel.build(map, self);
    }

    public RevokePushMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokePushMessageResponse setBody(RevokePushMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokePushMessageResponseBody getBody() {
        return this.body;
    }

}
