// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class UpdateUserAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserAuthConfigResponseBody body;

    public static UpdateUserAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthConfigResponse self = new UpdateUserAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserAuthConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserAuthConfigResponse setBody(UpdateUserAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserAuthConfigResponseBody getBody() {
        return this.body;
    }

}
