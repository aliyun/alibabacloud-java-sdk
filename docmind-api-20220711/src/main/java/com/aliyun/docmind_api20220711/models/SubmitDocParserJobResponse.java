// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocParserJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocParserJobResponseBody body;

    public static SubmitDocParserJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocParserJobResponse self = new SubmitDocParserJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocParserJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocParserJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocParserJobResponse setBody(SubmitDocParserJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocParserJobResponseBody getBody() {
        return this.body;
    }

}
