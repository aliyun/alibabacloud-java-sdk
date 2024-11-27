// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAbacAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAbacAuthorizationResponseBody body;

    public static CreateAbacAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAbacAuthorizationResponse self = new CreateAbacAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateAbacAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAbacAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAbacAuthorizationResponse setBody(CreateAbacAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAbacAuthorizationResponseBody getBody() {
        return this.body;
    }

}
