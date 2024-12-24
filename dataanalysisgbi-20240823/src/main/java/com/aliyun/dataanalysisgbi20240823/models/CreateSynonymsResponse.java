// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CreateSynonymsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSynonymsResponseBody body;

    public static CreateSynonymsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSynonymsResponse self = new CreateSynonymsResponse();
        return TeaModel.build(map, self);
    }

    public CreateSynonymsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSynonymsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSynonymsResponse setBody(CreateSynonymsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSynonymsResponseBody getBody() {
        return this.body;
    }

}
