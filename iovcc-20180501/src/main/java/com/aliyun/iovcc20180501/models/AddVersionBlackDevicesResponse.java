// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionBlackDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddVersionBlackDevicesResponseBody body;

    public static AddVersionBlackDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVersionBlackDevicesResponse self = new AddVersionBlackDevicesResponse();
        return TeaModel.build(map, self);
    }

    public AddVersionBlackDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVersionBlackDevicesResponse setBody(AddVersionBlackDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVersionBlackDevicesResponseBody getBody() {
        return this.body;
    }

}
