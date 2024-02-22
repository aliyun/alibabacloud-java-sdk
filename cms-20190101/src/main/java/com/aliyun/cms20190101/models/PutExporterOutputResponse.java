// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutExporterOutputResponseBody body;

    public static PutExporterOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        PutExporterOutputResponse self = new PutExporterOutputResponse();
        return TeaModel.build(map, self);
    }

    public PutExporterOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutExporterOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutExporterOutputResponse setBody(PutExporterOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public PutExporterOutputResponseBody getBody() {
        return this.body;
    }

}
