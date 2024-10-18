// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportOssCheckStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportOssCheckStatResponseBody body;

    public static ExportOssCheckStatResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportOssCheckStatResponse self = new ExportOssCheckStatResponse();
        return TeaModel.build(map, self);
    }

    public ExportOssCheckStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportOssCheckStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportOssCheckStatResponse setBody(ExportOssCheckStatResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportOssCheckStatResponseBody getBody() {
        return this.body;
    }

}
