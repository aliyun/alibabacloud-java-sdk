// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UpdateEslDeviceLightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEslDeviceLightResponseBody body;

    public static UpdateEslDeviceLightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEslDeviceLightResponse self = new UpdateEslDeviceLightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEslDeviceLightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEslDeviceLightResponse setBody(UpdateEslDeviceLightResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEslDeviceLightResponseBody getBody() {
        return this.body;
    }

}
