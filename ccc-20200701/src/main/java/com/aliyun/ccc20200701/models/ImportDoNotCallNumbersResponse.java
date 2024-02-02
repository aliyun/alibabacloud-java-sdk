// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportDoNotCallNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDoNotCallNumbersResponseBody body;

    public static ImportDoNotCallNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDoNotCallNumbersResponse self = new ImportDoNotCallNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ImportDoNotCallNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDoNotCallNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDoNotCallNumbersResponse setBody(ImportDoNotCallNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDoNotCallNumbersResponseBody getBody() {
        return this.body;
    }

}
