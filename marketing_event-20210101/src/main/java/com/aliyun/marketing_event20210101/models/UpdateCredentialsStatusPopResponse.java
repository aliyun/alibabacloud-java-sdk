// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class UpdateCredentialsStatusPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCredentialsStatusPopResponseBody body;

    public static UpdateCredentialsStatusPopResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialsStatusPopResponse self = new UpdateCredentialsStatusPopResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialsStatusPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCredentialsStatusPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCredentialsStatusPopResponse setBody(UpdateCredentialsStatusPopResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialsStatusPopResponseBody getBody() {
        return this.body;
    }

}
