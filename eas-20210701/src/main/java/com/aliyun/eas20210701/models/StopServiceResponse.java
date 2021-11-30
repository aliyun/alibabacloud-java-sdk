// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class StopServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopServiceResponseBody body;

    public static StopServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopServiceResponse self = new StopServiceResponse();
        return TeaModel.build(map, self);
    }

    public StopServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopServiceResponse setBody(StopServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopServiceResponseBody getBody() {
        return this.body;
    }

}
