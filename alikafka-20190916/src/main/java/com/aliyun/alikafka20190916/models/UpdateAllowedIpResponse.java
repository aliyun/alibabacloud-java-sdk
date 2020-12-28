// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateAllowedIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAllowedIpResponseBody body;

    public static UpdateAllowedIpResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAllowedIpResponse self = new UpdateAllowedIpResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAllowedIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAllowedIpResponse setBody(UpdateAllowedIpResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAllowedIpResponseBody getBody() {
        return this.body;
    }

}
