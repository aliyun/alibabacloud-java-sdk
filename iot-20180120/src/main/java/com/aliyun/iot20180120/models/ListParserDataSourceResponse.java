// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListParserDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListParserDataSourceResponseBody body;

    public static ListParserDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParserDataSourceResponse self = new ListParserDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ListParserDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParserDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListParserDataSourceResponse setBody(ListParserDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParserDataSourceResponseBody getBody() {
        return this.body;
    }

}
