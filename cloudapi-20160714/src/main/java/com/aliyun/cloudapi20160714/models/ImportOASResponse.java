// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportOASResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportOASResponseBody body;

    public static ImportOASResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportOASResponse self = new ImportOASResponse();
        return TeaModel.build(map, self);
    }

    public ImportOASResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportOASResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportOASResponse setBody(ImportOASResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportOASResponseBody getBody() {
        return this.body;
    }

}
