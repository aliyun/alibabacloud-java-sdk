// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExporterOutputResponseBody body;

    public static DeleteExporterOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterOutputResponse self = new DeleteExporterOutputResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExporterOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExporterOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExporterOutputResponse setBody(DeleteExporterOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExporterOutputResponseBody getBody() {
        return this.body;
    }

}
