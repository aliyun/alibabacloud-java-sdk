// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class HostBindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HostBindResponseBody body;

    public static HostBindResponse build(java.util.Map<String, ?> map) throws Exception {
        HostBindResponse self = new HostBindResponse();
        return TeaModel.build(map, self);
    }

    public HostBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HostBindResponse setBody(HostBindResponseBody body) {
        this.body = body;
        return this;
    }
    public HostBindResponseBody getBody() {
        return this.body;
    }

}
