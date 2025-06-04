// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ImportTaskNumberDatasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportTaskNumberDatasResponseBody body;

    public static ImportTaskNumberDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportTaskNumberDatasResponse self = new ImportTaskNumberDatasResponse();
        return TeaModel.build(map, self);
    }

    public ImportTaskNumberDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportTaskNumberDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportTaskNumberDatasResponse setBody(ImportTaskNumberDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportTaskNumberDatasResponseBody getBody() {
        return this.body;
    }

}
