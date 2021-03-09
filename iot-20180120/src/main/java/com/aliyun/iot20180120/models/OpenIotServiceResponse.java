// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class OpenIotServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenIotServiceResponseBody body;

    public static OpenIotServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenIotServiceResponse self = new OpenIotServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenIotServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenIotServiceResponse setBody(OpenIotServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenIotServiceResponseBody getBody() {
        return this.body;
    }

}
