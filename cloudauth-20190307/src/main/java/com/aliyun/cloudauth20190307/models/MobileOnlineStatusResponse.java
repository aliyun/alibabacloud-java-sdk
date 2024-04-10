// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileOnlineStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MobileOnlineStatusResponseBody body;

    public static MobileOnlineStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        MobileOnlineStatusResponse self = new MobileOnlineStatusResponse();
        return TeaModel.build(map, self);
    }

    public MobileOnlineStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MobileOnlineStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MobileOnlineStatusResponse setBody(MobileOnlineStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public MobileOnlineStatusResponseBody getBody() {
        return this.body;
    }

}
