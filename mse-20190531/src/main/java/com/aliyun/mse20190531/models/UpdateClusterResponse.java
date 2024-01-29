// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterResponseBody body;

    public static UpdateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterResponse self = new UpdateClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterResponse setBody(UpdateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterResponseBody getBody() {
        return this.body;
    }

}
