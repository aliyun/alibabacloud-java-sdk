// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MobileOnlineTimeResponseBody body;

    public static MobileOnlineTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        MobileOnlineTimeResponse self = new MobileOnlineTimeResponse();
        return TeaModel.build(map, self);
    }

    public MobileOnlineTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MobileOnlineTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MobileOnlineTimeResponse setBody(MobileOnlineTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public MobileOnlineTimeResponseBody getBody() {
        return this.body;
    }

}
