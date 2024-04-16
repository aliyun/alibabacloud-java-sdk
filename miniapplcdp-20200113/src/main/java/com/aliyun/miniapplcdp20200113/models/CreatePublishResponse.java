// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreatePublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePublishResponseBody body;

    public static CreatePublishResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishResponse self = new CreatePublishResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublishResponse setBody(CreatePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublishResponseBody getBody() {
        return this.body;
    }

}
