// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExternalUserUpdateResponseBody body;

    public static ExternalUserUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserUpdateResponse self = new ExternalUserUpdateResponse();
        return TeaModel.build(map, self);
    }

    public ExternalUserUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExternalUserUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExternalUserUpdateResponse setBody(ExternalUserUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExternalUserUpdateResponseBody getBody() {
        return this.body;
    }

}
