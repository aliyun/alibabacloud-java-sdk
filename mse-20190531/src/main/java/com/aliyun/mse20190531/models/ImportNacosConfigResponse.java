// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportNacosConfigResponseBody body;

    public static ImportNacosConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportNacosConfigResponse self = new ImportNacosConfigResponse();
        return TeaModel.build(map, self);
    }

    public ImportNacosConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportNacosConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportNacosConfigResponse setBody(ImportNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportNacosConfigResponseBody getBody() {
        return this.body;
    }

}
