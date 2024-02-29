// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SuspendInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendInstanceResponseBody body;

    public static SuspendInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendInstanceResponse self = new SuspendInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SuspendInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendInstanceResponse setBody(SuspendInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendInstanceResponseBody getBody() {
        return this.body;
    }

}
