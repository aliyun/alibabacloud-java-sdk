// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGrayReleaseTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DemoGrayReleaseTestResponseBody body;

    public static DemoGrayReleaseTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DemoGrayReleaseTestResponse self = new DemoGrayReleaseTestResponse();
        return TeaModel.build(map, self);
    }

    public DemoGrayReleaseTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DemoGrayReleaseTestResponse setBody(DemoGrayReleaseTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DemoGrayReleaseTestResponseBody getBody() {
        return this.body;
    }

}
