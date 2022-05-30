// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class PromVpcExporterManagerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PromVpcExporterManagerResponseBody body;

    public static PromVpcExporterManagerResponse build(java.util.Map<String, ?> map) throws Exception {
        PromVpcExporterManagerResponse self = new PromVpcExporterManagerResponse();
        return TeaModel.build(map, self);
    }

    public PromVpcExporterManagerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PromVpcExporterManagerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PromVpcExporterManagerResponse setBody(PromVpcExporterManagerResponseBody body) {
        this.body = body;
        return this;
    }
    public PromVpcExporterManagerResponseBody getBody() {
        return this.body;
    }

}
