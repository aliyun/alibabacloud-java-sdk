// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CreateBusinessLogicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBusinessLogicResponseBody body;

    public static CreateBusinessLogicResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessLogicResponse self = new CreateBusinessLogicResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessLogicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBusinessLogicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBusinessLogicResponse setBody(CreateBusinessLogicResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBusinessLogicResponseBody getBody() {
        return this.body;
    }

}
