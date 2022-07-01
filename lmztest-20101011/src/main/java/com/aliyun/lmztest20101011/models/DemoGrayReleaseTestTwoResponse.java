// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGrayReleaseTestTwoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DemoGrayReleaseTestTwoResponseBody body;

    public static DemoGrayReleaseTestTwoResponse build(java.util.Map<String, ?> map) throws Exception {
        DemoGrayReleaseTestTwoResponse self = new DemoGrayReleaseTestTwoResponse();
        return TeaModel.build(map, self);
    }

    public DemoGrayReleaseTestTwoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DemoGrayReleaseTestTwoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DemoGrayReleaseTestTwoResponse setBody(DemoGrayReleaseTestTwoResponseBody body) {
        this.body = body;
        return this;
    }
    public DemoGrayReleaseTestTwoResponseBody getBody() {
        return this.body;
    }

}
