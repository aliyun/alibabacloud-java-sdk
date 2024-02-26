// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceConfigResponseBody body;

    public static UpdateInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceConfigResponse self = new UpdateInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceConfigResponse setBody(UpdateInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
