// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserInternetStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePostpayUserInternetStatusResponseBody body;

    public static UpdatePostpayUserInternetStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostpayUserInternetStatusResponse self = new UpdatePostpayUserInternetStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePostpayUserInternetStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePostpayUserInternetStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePostpayUserInternetStatusResponse setBody(UpdatePostpayUserInternetStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePostpayUserInternetStatusResponseBody getBody() {
        return this.body;
    }

}
