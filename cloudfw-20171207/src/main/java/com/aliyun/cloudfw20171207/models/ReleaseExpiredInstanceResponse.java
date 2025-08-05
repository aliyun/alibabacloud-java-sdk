// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ReleaseExpiredInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseExpiredInstanceResponseBody body;

    public static ReleaseExpiredInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseExpiredInstanceResponse self = new ReleaseExpiredInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseExpiredInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseExpiredInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseExpiredInstanceResponse setBody(ReleaseExpiredInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseExpiredInstanceResponseBody getBody() {
        return this.body;
    }

}
