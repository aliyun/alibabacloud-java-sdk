// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateResourceServerScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceServerScopeResponseBody body;

    public static UpdateResourceServerScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceServerScopeResponse self = new UpdateResourceServerScopeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceServerScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceServerScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceServerScopeResponse setBody(UpdateResourceServerScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceServerScopeResponseBody getBody() {
        return this.body;
    }

}
