// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateParserDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateParserDataSourceResponseBody body;

    public static CreateParserDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParserDataSourceResponse self = new CreateParserDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateParserDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParserDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateParserDataSourceResponse setBody(CreateParserDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParserDataSourceResponseBody getBody() {
        return this.body;
    }

}
