// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneNacosConfigResponseBody body;

    public static CloneNacosConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneNacosConfigResponse self = new CloneNacosConfigResponse();
        return TeaModel.build(map, self);
    }

    public CloneNacosConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneNacosConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneNacosConfigResponse setBody(CloneNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneNacosConfigResponseBody getBody() {
        return this.body;
    }

}
