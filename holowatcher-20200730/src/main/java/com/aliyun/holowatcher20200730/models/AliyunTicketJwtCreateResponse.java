// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunTicketJwtCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AliyunTicketJwtCreateResponseBody body;

    public static AliyunTicketJwtCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        AliyunTicketJwtCreateResponse self = new AliyunTicketJwtCreateResponse();
        return TeaModel.build(map, self);
    }

    public AliyunTicketJwtCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AliyunTicketJwtCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AliyunTicketJwtCreateResponse setBody(AliyunTicketJwtCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public AliyunTicketJwtCreateResponseBody getBody() {
        return this.body;
    }

}
