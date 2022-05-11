// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportDoNotCallNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExportDoNotCallNumbersResponseBody body;

    public static ExportDoNotCallNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDoNotCallNumbersResponse self = new ExportDoNotCallNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ExportDoNotCallNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDoNotCallNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportDoNotCallNumbersResponse setBody(ExportDoNotCallNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDoNotCallNumbersResponseBody getBody() {
        return this.body;
    }

}
