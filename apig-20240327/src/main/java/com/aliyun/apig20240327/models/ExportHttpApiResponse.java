// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ExportHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportHttpApiResponseBody body;

    public static ExportHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportHttpApiResponse self = new ExportHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public ExportHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportHttpApiResponse setBody(ExportHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportHttpApiResponseBody getBody() {
        return this.body;
    }

}
