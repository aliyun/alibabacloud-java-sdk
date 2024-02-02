// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RedeployInstanceResponseBody body;

    public static RedeployInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RedeployInstanceResponse self = new RedeployInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RedeployInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RedeployInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RedeployInstanceResponse setBody(RedeployInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RedeployInstanceResponseBody getBody() {
        return this.body;
    }

}
