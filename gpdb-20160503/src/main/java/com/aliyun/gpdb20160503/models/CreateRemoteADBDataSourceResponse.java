// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateRemoteADBDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRemoteADBDataSourceResponseBody body;

    public static CreateRemoteADBDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRemoteADBDataSourceResponse self = new CreateRemoteADBDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRemoteADBDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRemoteADBDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRemoteADBDataSourceResponse setBody(CreateRemoteADBDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRemoteADBDataSourceResponseBody getBody() {
        return this.body;
    }

}
