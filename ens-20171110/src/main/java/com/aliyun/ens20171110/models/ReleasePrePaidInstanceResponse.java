// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePrePaidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleasePrePaidInstanceResponseBody body;

    public static ReleasePrePaidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePrePaidInstanceResponse self = new ReleasePrePaidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePrePaidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePrePaidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleasePrePaidInstanceResponse setBody(ReleasePrePaidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePrePaidInstanceResponseBody getBody() {
        return this.body;
    }

}
