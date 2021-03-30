// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class OpenEmasServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenEmasServiceResponseBody body;

    public static OpenEmasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenEmasServiceResponse self = new OpenEmasServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenEmasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenEmasServiceResponse setBody(OpenEmasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenEmasServiceResponseBody getBody() {
        return this.body;
    }

}
