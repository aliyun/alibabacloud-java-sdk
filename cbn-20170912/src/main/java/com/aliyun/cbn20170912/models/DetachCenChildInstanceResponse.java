// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DetachCenChildInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachCenChildInstanceResponseBody body;

    public static DetachCenChildInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachCenChildInstanceResponse self = new DetachCenChildInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DetachCenChildInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachCenChildInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachCenChildInstanceResponse setBody(DetachCenChildInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachCenChildInstanceResponseBody getBody() {
        return this.body;
    }

}
