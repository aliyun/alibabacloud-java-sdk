// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDeviceFormResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDeviceFormResponseBody body;

    public static DeleteDeviceFormResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceFormResponse self = new DeleteDeviceFormResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceFormResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceFormResponse setBody(DeleteDeviceFormResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceFormResponseBody getBody() {
        return this.body;
    }

}
