// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteNvrDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNvrDeviceResponseBody body;

    public static DeleteNvrDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNvrDeviceResponse self = new DeleteNvrDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNvrDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNvrDeviceResponse setBody(DeleteNvrDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNvrDeviceResponseBody getBody() {
        return this.body;
    }

}
