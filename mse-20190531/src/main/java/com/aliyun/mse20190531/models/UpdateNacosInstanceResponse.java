// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNacosInstanceResponseBody body;

    public static UpdateNacosInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosInstanceResponse self = new UpdateNacosInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNacosInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNacosInstanceResponse setBody(UpdateNacosInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacosInstanceResponseBody getBody() {
        return this.body;
    }

}
