// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNacosClusterResponseBody body;

    public static UpdateNacosClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosClusterResponse self = new UpdateNacosClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNacosClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNacosClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNacosClusterResponse setBody(UpdateNacosClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacosClusterResponseBody getBody() {
        return this.body;
    }

}
