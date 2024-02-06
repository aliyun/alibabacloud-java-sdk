// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePostPaidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleasePostPaidInstanceResponseBody body;

    public static ReleasePostPaidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostPaidInstanceResponse self = new ReleasePostPaidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePostPaidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePostPaidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleasePostPaidInstanceResponse setBody(ReleasePostPaidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePostPaidInstanceResponseBody getBody() {
        return this.body;
    }

}
