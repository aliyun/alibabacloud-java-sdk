// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class AddApDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddApDeviceResponseBody body;

    public static AddApDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddApDeviceResponse self = new AddApDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddApDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddApDeviceResponse setBody(AddApDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddApDeviceResponseBody getBody() {
        return this.body;
    }

}
