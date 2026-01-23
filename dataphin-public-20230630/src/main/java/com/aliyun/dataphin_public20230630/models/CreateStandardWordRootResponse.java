// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardWordRootResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStandardWordRootResponseBody body;

    public static CreateStandardWordRootResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardWordRootResponse self = new CreateStandardWordRootResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardWordRootResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStandardWordRootResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStandardWordRootResponse setBody(CreateStandardWordRootResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStandardWordRootResponseBody getBody() {
        return this.body;
    }

}
