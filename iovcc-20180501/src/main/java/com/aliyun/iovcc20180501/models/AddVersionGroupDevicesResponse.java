// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionGroupDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddVersionGroupDevicesResponseBody body;

    public static AddVersionGroupDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVersionGroupDevicesResponse self = new AddVersionGroupDevicesResponse();
        return TeaModel.build(map, self);
    }

    public AddVersionGroupDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVersionGroupDevicesResponse setBody(AddVersionGroupDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVersionGroupDevicesResponseBody getBody() {
        return this.body;
    }

}
