// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class UserGcSerivceGrayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UserGcSerivceGrayResponseBody body;

    public static UserGcSerivceGrayResponse build(java.util.Map<String, ?> map) throws Exception {
        UserGcSerivceGrayResponse self = new UserGcSerivceGrayResponse();
        return TeaModel.build(map, self);
    }

    public UserGcSerivceGrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserGcSerivceGrayResponse setBody(UserGcSerivceGrayResponseBody body) {
        this.body = body;
        return this;
    }
    public UserGcSerivceGrayResponseBody getBody() {
        return this.body;
    }

}
