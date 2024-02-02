// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootInstanceResponseBody body;

    public static RebootInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootInstanceResponse self = new RebootInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebootInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootInstanceResponse setBody(RebootInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootInstanceResponseBody getBody() {
        return this.body;
    }

}
