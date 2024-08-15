// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosGrayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNacosGrayConfigResponseBody body;

    public static UpdateNacosGrayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosGrayConfigResponse self = new UpdateNacosGrayConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNacosGrayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNacosGrayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNacosGrayConfigResponse setBody(UpdateNacosGrayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNacosGrayConfigResponseBody getBody() {
        return this.body;
    }

}
