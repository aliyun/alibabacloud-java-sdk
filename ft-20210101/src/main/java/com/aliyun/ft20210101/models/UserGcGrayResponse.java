// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class UserGcGrayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UserGcGrayResponseBody body;

    public static UserGcGrayResponse build(java.util.Map<String, ?> map) throws Exception {
        UserGcGrayResponse self = new UserGcGrayResponse();
        return TeaModel.build(map, self);
    }

    public UserGcGrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserGcGrayResponse setBody(UserGcGrayResponseBody body) {
        this.body = body;
        return this;
    }
    public UserGcGrayResponseBody getBody() {
        return this.body;
    }

}
