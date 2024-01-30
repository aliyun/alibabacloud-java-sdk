// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ReleaseApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseApplicationResponseBody body;

    public static ReleaseApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseApplicationResponse self = new ReleaseApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseApplicationResponse setBody(ReleaseApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseApplicationResponseBody getBody() {
        return this.body;
    }

}
