// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ExportApplicationConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportApplicationConfigsResponseBody body;

    public static ExportApplicationConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportApplicationConfigsResponse self = new ExportApplicationConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ExportApplicationConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportApplicationConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportApplicationConfigsResponse setBody(ExportApplicationConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportApplicationConfigsResponseBody getBody() {
        return this.body;
    }

}
