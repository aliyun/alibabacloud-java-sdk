// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserNatStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePostpayUserNatStatusResponseBody body;

    public static UpdatePostpayUserNatStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostpayUserNatStatusResponse self = new UpdatePostpayUserNatStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePostpayUserNatStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePostpayUserNatStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePostpayUserNatStatusResponse setBody(UpdatePostpayUserNatStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePostpayUserNatStatusResponseBody getBody() {
        return this.body;
    }

}
