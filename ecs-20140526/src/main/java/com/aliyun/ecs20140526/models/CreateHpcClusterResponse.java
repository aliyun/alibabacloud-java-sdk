// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateHpcClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHpcClusterResponseBody body;

    public static CreateHpcClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHpcClusterResponse self = new CreateHpcClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateHpcClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHpcClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHpcClusterResponse setBody(CreateHpcClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHpcClusterResponseBody getBody() {
        return this.body;
    }

}
