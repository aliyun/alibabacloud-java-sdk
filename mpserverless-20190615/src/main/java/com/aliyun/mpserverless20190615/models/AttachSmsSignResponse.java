// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AttachSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachSmsSignResponseBody body;

    public static AttachSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachSmsSignResponse self = new AttachSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public AttachSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachSmsSignResponse setBody(AttachSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachSmsSignResponseBody getBody() {
        return this.body;
    }

}
