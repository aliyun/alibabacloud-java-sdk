// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachDdosFromAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachDdosFromAcceleratorResponseBody body;

    public static DetachDdosFromAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDdosFromAcceleratorResponse self = new DetachDdosFromAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public DetachDdosFromAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDdosFromAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachDdosFromAcceleratorResponse setBody(DetachDdosFromAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDdosFromAcceleratorResponseBody getBody() {
        return this.body;
    }

}
