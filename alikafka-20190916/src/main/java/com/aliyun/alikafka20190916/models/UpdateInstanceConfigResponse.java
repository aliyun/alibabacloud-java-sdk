// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceConfigResponseBody body;

    public static UpdateInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceConfigResponse self = new UpdateInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceConfigResponse setBody(UpdateInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
