// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportServicesResponseBody body;

    public static ImportServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportServicesResponse self = new ImportServicesResponse();
        return TeaModel.build(map, self);
    }

    public ImportServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportServicesResponse setBody(ImportServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportServicesResponseBody getBody() {
        return this.body;
    }

}
