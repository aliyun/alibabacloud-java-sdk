// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportCorpNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportCorpNumbersResponseBody body;

    public static ImportCorpNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportCorpNumbersResponse self = new ImportCorpNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ImportCorpNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportCorpNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportCorpNumbersResponse setBody(ImportCorpNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportCorpNumbersResponseBody getBody() {
        return this.body;
    }

}
