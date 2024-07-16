// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class RevokeNetLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeNetLinkResponseBody body;

    public static RevokeNetLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeNetLinkResponse self = new RevokeNetLinkResponse();
        return TeaModel.build(map, self);
    }

    public RevokeNetLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeNetLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeNetLinkResponse setBody(RevokeNetLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeNetLinkResponseBody getBody() {
        return this.body;
    }

}
