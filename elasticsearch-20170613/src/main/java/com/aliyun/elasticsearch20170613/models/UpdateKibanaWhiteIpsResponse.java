// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaWhiteIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateKibanaWhiteIpsResponseBody body;

    public static UpdateKibanaWhiteIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaWhiteIpsResponse self = new UpdateKibanaWhiteIpsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaWhiteIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKibanaWhiteIpsResponse setBody(UpdateKibanaWhiteIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKibanaWhiteIpsResponseBody getBody() {
        return this.body;
    }

}
