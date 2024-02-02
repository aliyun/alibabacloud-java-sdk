// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AttachParserDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachParserDataSourceResponseBody body;

    public static AttachParserDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachParserDataSourceResponse self = new AttachParserDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public AttachParserDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachParserDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachParserDataSourceResponse setBody(AttachParserDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachParserDataSourceResponseBody getBody() {
        return this.body;
    }

}
