// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UnbindEslDeviceShelfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindEslDeviceShelfResponseBody body;

    public static UnbindEslDeviceShelfResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindEslDeviceShelfResponse self = new UnbindEslDeviceShelfResponse();
        return TeaModel.build(map, self);
    }

    public UnbindEslDeviceShelfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindEslDeviceShelfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindEslDeviceShelfResponse setBody(UnbindEslDeviceShelfResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindEslDeviceShelfResponseBody getBody() {
        return this.body;
    }

}
