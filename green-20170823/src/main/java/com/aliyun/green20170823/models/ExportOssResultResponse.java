// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ExportOssResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportOssResultResponseBody body;

    public static ExportOssResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportOssResultResponse self = new ExportOssResultResponse();
        return TeaModel.build(map, self);
    }

    public ExportOssResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportOssResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportOssResultResponse setBody(ExportOssResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportOssResultResponseBody getBody() {
        return this.body;
    }

}
