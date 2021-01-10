// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class EnableSmsServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSmsServiceResponseBody body;

    public static EnableSmsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSmsServiceResponse self = new EnableSmsServiceResponse();
        return TeaModel.build(map, self);
    }

    public EnableSmsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSmsServiceResponse setBody(EnableSmsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSmsServiceResponseBody getBody() {
        return this.body;
    }

}
