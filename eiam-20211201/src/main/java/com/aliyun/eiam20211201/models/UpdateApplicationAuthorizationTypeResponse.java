// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationAuthorizationTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationAuthorizationTypeResponseBody body;

    public static UpdateApplicationAuthorizationTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationAuthorizationTypeResponse self = new UpdateApplicationAuthorizationTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationAuthorizationTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationAuthorizationTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationAuthorizationTypeResponse setBody(UpdateApplicationAuthorizationTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationAuthorizationTypeResponseBody getBody() {
        return this.body;
    }

}
