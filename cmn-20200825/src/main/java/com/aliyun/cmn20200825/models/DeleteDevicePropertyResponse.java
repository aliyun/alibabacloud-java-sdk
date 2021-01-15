// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDevicePropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDevicePropertyResponseBody body;

    public static DeleteDevicePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicePropertyResponse self = new DeleteDevicePropertyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevicePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevicePropertyResponse setBody(DeleteDevicePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevicePropertyResponseBody getBody() {
        return this.body;
    }

}
