// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CreateDatasourceAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatasourceAuthorizationResponseBody body;

    public static CreateDatasourceAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasourceAuthorizationResponse self = new CreateDatasourceAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatasourceAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatasourceAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatasourceAuthorizationResponse setBody(CreateDatasourceAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatasourceAuthorizationResponseBody getBody() {
        return this.body;
    }

}
