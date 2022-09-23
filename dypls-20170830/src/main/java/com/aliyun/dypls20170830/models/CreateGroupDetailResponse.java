// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupDetailResponseBody body;

    public static CreateGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupDetailResponse self = new CreateGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupDetailResponse setBody(CreateGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupDetailResponseBody getBody() {
        return this.body;
    }

}
