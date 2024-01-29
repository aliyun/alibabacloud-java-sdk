// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportNacosConfigResponseBody body;

    public static ExportNacosConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportNacosConfigResponse self = new ExportNacosConfigResponse();
        return TeaModel.build(map, self);
    }

    public ExportNacosConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportNacosConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportNacosConfigResponse setBody(ExportNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportNacosConfigResponseBody getBody() {
        return this.body;
    }

}
