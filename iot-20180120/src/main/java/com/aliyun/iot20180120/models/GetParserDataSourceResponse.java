// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetParserDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParserDataSourceResponseBody body;

    public static GetParserDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParserDataSourceResponse self = new GetParserDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetParserDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParserDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParserDataSourceResponse setBody(GetParserDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParserDataSourceResponseBody getBody() {
        return this.body;
    }

}
