// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationSsoConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApplicationSsoConfigResponseBody body;

    public static SetApplicationSsoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationSsoConfigResponse self = new SetApplicationSsoConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetApplicationSsoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApplicationSsoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApplicationSsoConfigResponse setBody(SetApplicationSsoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApplicationSsoConfigResponseBody getBody() {
        return this.body;
    }

}
