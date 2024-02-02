// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateParserDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateParserDataSourceResponseBody body;

    public static UpdateParserDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateParserDataSourceResponse self = new UpdateParserDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateParserDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateParserDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateParserDataSourceResponse setBody(UpdateParserDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateParserDataSourceResponseBody getBody() {
        return this.body;
    }

}
