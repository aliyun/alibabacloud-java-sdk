// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteHubClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteHubClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHubClusterResponse setBody(DeleteHubClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHubClusterResponseBody getBody() {
        return this.body;
    }

}
