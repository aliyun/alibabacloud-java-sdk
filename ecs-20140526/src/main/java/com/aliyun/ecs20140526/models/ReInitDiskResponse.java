// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReInitDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReInitDiskResponseBody body;

    public static ReInitDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskResponse self = new ReInitDiskResponse();
        return TeaModel.build(map, self);
    }

    public ReInitDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReInitDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReInitDiskResponse setBody(ReInitDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReInitDiskResponseBody getBody() {
        return this.body;
    }

}
