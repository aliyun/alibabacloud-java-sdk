// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ReplaceDedicatedHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceDedicatedHostResponseBody body;

    public static ReplaceDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDedicatedHostResponse self = new ReplaceDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceDedicatedHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceDedicatedHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceDedicatedHostResponse setBody(ReplaceDedicatedHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceDedicatedHostResponseBody getBody() {
        return this.body;
    }

}
