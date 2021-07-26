// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceResourceResponseBody body;

    public static UpdateDeviceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceResourceResponse self = new UpdateDeviceResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceResourceResponse setBody(UpdateDeviceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceResourceResponseBody getBody() {
        return this.body;
    }

}
