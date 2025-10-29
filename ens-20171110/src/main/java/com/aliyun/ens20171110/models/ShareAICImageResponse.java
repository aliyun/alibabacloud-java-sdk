// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ShareAICImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShareAICImageResponseBody body;

    public static ShareAICImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ShareAICImageResponse self = new ShareAICImageResponse();
        return TeaModel.build(map, self);
    }

    public ShareAICImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShareAICImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShareAICImageResponse setBody(ShareAICImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ShareAICImageResponseBody getBody() {
        return this.body;
    }

}
