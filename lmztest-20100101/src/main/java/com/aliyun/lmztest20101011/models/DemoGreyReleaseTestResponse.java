// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGreyReleaseTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DemoGreyReleaseTestResponseBody body;

    public static DemoGreyReleaseTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DemoGreyReleaseTestResponse self = new DemoGreyReleaseTestResponse();
        return TeaModel.build(map, self);
    }

    public DemoGreyReleaseTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DemoGreyReleaseTestResponse setBody(DemoGreyReleaseTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DemoGreyReleaseTestResponseBody getBody() {
        return this.body;
    }

}
