// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateContainerClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContainerClusterResponseBody body;

    public static UpdateContainerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerClusterResponse self = new UpdateContainerClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContainerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContainerClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContainerClusterResponse setBody(UpdateContainerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContainerClusterResponseBody getBody() {
        return this.body;
    }

}
