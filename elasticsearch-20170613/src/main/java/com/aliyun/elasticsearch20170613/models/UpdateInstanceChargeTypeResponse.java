// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceChargeTypeResponseBody body;

    public static UpdateInstanceChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceChargeTypeResponse self = new UpdateInstanceChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceChargeTypeResponse setBody(UpdateInstanceChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceChargeTypeResponseBody getBody() {
        return this.body;
    }

}
