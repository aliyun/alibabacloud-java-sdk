// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteHubClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHubClusterResponseBody body;

    public static DeleteHubClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHubClusterResponse self = new DeleteHubClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHubClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHubClusterResponse setBody(DeleteHubClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHubClusterResponseBody getBody() {
        return this.body;
    }

}
