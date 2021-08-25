// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class LaunchServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LaunchServiceResponseBody body;

    public static LaunchServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchServiceResponse self = new LaunchServiceResponse();
        return TeaModel.build(map, self);
    }

    public LaunchServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchServiceResponse setBody(LaunchServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchServiceResponseBody getBody() {
        return this.body;
    }

}
