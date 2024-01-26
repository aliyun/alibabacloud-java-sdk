// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteCmsExporterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCmsExporterResponseBody body;

    public static DeleteCmsExporterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCmsExporterResponse self = new DeleteCmsExporterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCmsExporterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCmsExporterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCmsExporterResponse setBody(DeleteCmsExporterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCmsExporterResponseBody getBody() {
        return this.body;
    }

}
