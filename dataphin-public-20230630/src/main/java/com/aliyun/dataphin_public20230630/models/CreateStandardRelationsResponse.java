// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStandardRelationsResponseBody body;

    public static CreateStandardRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardRelationsResponse self = new CreateStandardRelationsResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStandardRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStandardRelationsResponse setBody(CreateStandardRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStandardRelationsResponseBody getBody() {
        return this.body;
    }

}
