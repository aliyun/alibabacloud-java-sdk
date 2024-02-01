// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteGbDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGbDeviceResponseBody body;

    public static DeleteGbDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGbDeviceResponse self = new DeleteGbDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGbDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGbDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGbDeviceResponse setBody(DeleteGbDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGbDeviceResponseBody getBody() {
        return this.body;
    }

}
