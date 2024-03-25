// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AttachCenChildInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachCenChildInstanceResponseBody body;

    public static AttachCenChildInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachCenChildInstanceResponse self = new AttachCenChildInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AttachCenChildInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachCenChildInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachCenChildInstanceResponse setBody(AttachCenChildInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachCenChildInstanceResponseBody getBody() {
        return this.body;
    }

}
