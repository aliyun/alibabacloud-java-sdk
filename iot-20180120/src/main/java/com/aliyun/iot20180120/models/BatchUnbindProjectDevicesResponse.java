// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUnbindProjectDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUnbindProjectDevicesResponseBody body;

    public static BatchUnbindProjectDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindProjectDevicesResponse self = new BatchUnbindProjectDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindProjectDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindProjectDevicesResponse setBody(BatchUnbindProjectDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindProjectDevicesResponseBody getBody() {
        return this.body;
    }

}
