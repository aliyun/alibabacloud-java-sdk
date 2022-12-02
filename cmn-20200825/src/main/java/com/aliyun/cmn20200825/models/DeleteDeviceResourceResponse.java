// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeviceResourceResponseBody body;

    public static DeleteDeviceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceResourceResponse self = new DeleteDeviceResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceResourceResponse setBody(DeleteDeviceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceResourceResponseBody getBody() {
        return this.body;
    }

}
