// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserVpcStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePostpayUserVpcStatusResponseBody body;

    public static UpdatePostpayUserVpcStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostpayUserVpcStatusResponse self = new UpdatePostpayUserVpcStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePostpayUserVpcStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePostpayUserVpcStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePostpayUserVpcStatusResponse setBody(UpdatePostpayUserVpcStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePostpayUserVpcStatusResponseBody getBody() {
        return this.body;
    }

}
