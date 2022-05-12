// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExportImageResponseBody body;

    public static ExportImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportImageResponse self = new ExportImageResponse();
        return TeaModel.build(map, self);
    }

    public ExportImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportImageResponse setBody(ExportImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportImageResponseBody getBody() {
        return this.body;
    }

}
