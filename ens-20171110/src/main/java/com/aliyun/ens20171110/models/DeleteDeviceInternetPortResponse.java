// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteDeviceInternetPortResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeviceInternetPortResponseBody body;

    public static DeleteDeviceInternetPortResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceInternetPortResponse self = new DeleteDeviceInternetPortResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceInternetPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceInternetPortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceInternetPortResponse setBody(DeleteDeviceInternetPortResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceInternetPortResponseBody getBody() {
        return this.body;
    }

}
