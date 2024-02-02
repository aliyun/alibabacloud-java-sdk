// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePrefixListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrefixListResponseBody body;

    public static CreatePrefixListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrefixListResponse self = new CreatePrefixListResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrefixListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrefixListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrefixListResponse setBody(CreatePrefixListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrefixListResponseBody getBody() {
        return this.body;
    }

}
