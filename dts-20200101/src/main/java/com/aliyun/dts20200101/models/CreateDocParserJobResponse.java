// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDocParserJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDocParserJobResponseBody body;

    public static CreateDocParserJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDocParserJobResponse self = new CreateDocParserJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDocParserJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDocParserJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDocParserJobResponse setBody(CreateDocParserJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDocParserJobResponseBody getBody() {
        return this.body;
    }

}
