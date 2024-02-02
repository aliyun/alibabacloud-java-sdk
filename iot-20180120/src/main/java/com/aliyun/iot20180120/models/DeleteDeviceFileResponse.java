// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeviceFileResponseBody body;

    public static DeleteDeviceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceFileResponse self = new DeleteDeviceFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceFileResponse setBody(DeleteDeviceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceFileResponseBody getBody() {
        return this.body;
    }

}
