// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ReleaseServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseServiceResponseBody body;

    public static ReleaseServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseServiceResponse self = new ReleaseServiceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseServiceResponse setBody(ReleaseServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseServiceResponseBody getBody() {
        return this.body;
    }

}
