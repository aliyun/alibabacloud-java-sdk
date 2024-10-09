// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourcesResponseBody body;

    public static UpdateResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourcesResponse self = new UpdateResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourcesResponse setBody(UpdateResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourcesResponseBody getBody() {
        return this.body;
    }

}
