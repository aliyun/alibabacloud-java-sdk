// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupInfoResponseBody body;

    public static CreateGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupInfoResponse self = new CreateGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupInfoResponse setBody(CreateGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupInfoResponseBody getBody() {
        return this.body;
    }

}
