// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SaveDevicePropResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveDevicePropResponseBody body;

    public static SaveDevicePropResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveDevicePropResponse self = new SaveDevicePropResponse();
        return TeaModel.build(map, self);
    }

    public SaveDevicePropResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveDevicePropResponse setBody(SaveDevicePropResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveDevicePropResponseBody getBody() {
        return this.body;
    }

}
