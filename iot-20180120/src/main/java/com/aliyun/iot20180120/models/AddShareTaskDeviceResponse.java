// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddShareTaskDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddShareTaskDeviceResponseBody body;

    public static AddShareTaskDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddShareTaskDeviceResponse self = new AddShareTaskDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddShareTaskDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddShareTaskDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddShareTaskDeviceResponse setBody(AddShareTaskDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddShareTaskDeviceResponseBody getBody() {
        return this.body;
    }

}
