// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateVideoDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateVideoDevicesResponseBody body;

    public static UpdateVideoDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoDevicesResponse self = new UpdateVideoDevicesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoDevicesResponse setBody(UpdateVideoDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoDevicesResponseBody getBody() {
        return this.body;
    }

}
