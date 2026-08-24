// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ImportOneMetaOssieModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportOneMetaOssieModelResponseBody body;

    public static ImportOneMetaOssieModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportOneMetaOssieModelResponse self = new ImportOneMetaOssieModelResponse();
        return TeaModel.build(map, self);
    }

    public ImportOneMetaOssieModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportOneMetaOssieModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportOneMetaOssieModelResponse setBody(ImportOneMetaOssieModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportOneMetaOssieModelResponseBody getBody() {
        return this.body;
    }

}
