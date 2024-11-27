// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachInstanceSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachInstanceSDGResponseBody body;

    public static DetachInstanceSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceSDGResponse self = new DetachInstanceSDGResponse();
        return TeaModel.build(map, self);
    }

    public DetachInstanceSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachInstanceSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachInstanceSDGResponse setBody(DetachInstanceSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachInstanceSDGResponseBody getBody() {
        return this.body;
    }

}
