// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class JyQueryAppInfoBySceneCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public JyQueryAppInfoBySceneCodeResponseBody body;

    public static JyQueryAppInfoBySceneCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        JyQueryAppInfoBySceneCodeResponse self = new JyQueryAppInfoBySceneCodeResponse();
        return TeaModel.build(map, self);
    }

    public JyQueryAppInfoBySceneCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JyQueryAppInfoBySceneCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JyQueryAppInfoBySceneCodeResponse setBody(JyQueryAppInfoBySceneCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public JyQueryAppInfoBySceneCodeResponseBody getBody() {
        return this.body;
    }

}
