// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateLocationDateClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLocationDateClusterResponseBody body;

    public static UpdateLocationDateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocationDateClusterResponse self = new UpdateLocationDateClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLocationDateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLocationDateClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLocationDateClusterResponse setBody(UpdateLocationDateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLocationDateClusterResponseBody getBody() {
        return this.body;
    }

}
