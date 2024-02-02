// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteParserDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteParserDataSourceResponseBody body;

    public static DeleteParserDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParserDataSourceResponse self = new DeleteParserDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteParserDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteParserDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteParserDataSourceResponse setBody(DeleteParserDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteParserDataSourceResponseBody getBody() {
        return this.body;
    }

}
