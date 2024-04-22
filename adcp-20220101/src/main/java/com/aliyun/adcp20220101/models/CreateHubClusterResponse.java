// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class CreateHubClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHubClusterResponseBody body;

    public static CreateHubClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHubClusterResponse self = new CreateHubClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateHubClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHubClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHubClusterResponse setBody(CreateHubClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHubClusterResponseBody getBody() {
        return this.body;
    }

}
