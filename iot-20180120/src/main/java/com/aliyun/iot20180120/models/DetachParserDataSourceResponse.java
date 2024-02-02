// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DetachParserDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachParserDataSourceResponseBody body;

    public static DetachParserDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachParserDataSourceResponse self = new DetachParserDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DetachParserDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachParserDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachParserDataSourceResponse setBody(DetachParserDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachParserDataSourceResponseBody getBody() {
        return this.body;
    }

}
