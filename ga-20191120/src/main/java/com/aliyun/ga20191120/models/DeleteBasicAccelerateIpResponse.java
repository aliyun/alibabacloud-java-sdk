// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicAccelerateIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBasicAccelerateIpResponseBody body;

    public static DeleteBasicAccelerateIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicAccelerateIpResponse self = new DeleteBasicAccelerateIpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBasicAccelerateIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBasicAccelerateIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBasicAccelerateIpResponse setBody(DeleteBasicAccelerateIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBasicAccelerateIpResponseBody getBody() {
        return this.body;
    }

}
