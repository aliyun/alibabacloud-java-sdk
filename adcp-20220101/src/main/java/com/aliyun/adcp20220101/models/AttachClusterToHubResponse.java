// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class AttachClusterToHubResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachClusterToHubResponseBody body;

    public static AttachClusterToHubResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachClusterToHubResponse self = new AttachClusterToHubResponse();
        return TeaModel.build(map, self);
    }

    public AttachClusterToHubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachClusterToHubResponse setBody(AttachClusterToHubResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachClusterToHubResponseBody getBody() {
        return this.body;
    }

}
