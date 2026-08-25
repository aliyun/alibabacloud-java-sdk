// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BuildImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BuildImageResponseBody body;

    public static BuildImageResponse build(java.util.Map<String, ?> map) throws Exception {
        BuildImageResponse self = new BuildImageResponse();
        return TeaModel.build(map, self);
    }

    public BuildImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuildImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuildImageResponse setBody(BuildImageResponseBody body) {
        this.body = body;
        return this;
    }
    public BuildImageResponseBody getBody() {
        return this.body;
    }

}
