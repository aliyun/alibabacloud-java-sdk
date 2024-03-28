// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicAcceleratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBasicAcceleratorResponseBody body;

    public static DeleteBasicAcceleratorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicAcceleratorResponse self = new DeleteBasicAcceleratorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBasicAcceleratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBasicAcceleratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBasicAcceleratorResponse setBody(DeleteBasicAcceleratorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBasicAcceleratorResponseBody getBody() {
        return this.body;
    }

}
