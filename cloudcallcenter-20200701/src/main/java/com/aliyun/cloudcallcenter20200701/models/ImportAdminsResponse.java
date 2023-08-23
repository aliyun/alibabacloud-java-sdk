// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ImportAdminsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportAdminsResponseBody body;

    public static ImportAdminsResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportAdminsResponse self = new ImportAdminsResponse();
        return TeaModel.build(map, self);
    }

    public ImportAdminsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportAdminsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportAdminsResponse setBody(ImportAdminsResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportAdminsResponseBody getBody() {
        return this.body;
    }

}
