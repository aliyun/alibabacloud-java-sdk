// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionAllWhiteDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionAllWhiteDevicesResponseBody body;

    public static DeleteVersionAllWhiteDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionAllWhiteDevicesResponse self = new DeleteVersionAllWhiteDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionAllWhiteDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionAllWhiteDevicesResponse setBody(DeleteVersionAllWhiteDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionAllWhiteDevicesResponseBody getBody() {
        return this.body;
    }

}
