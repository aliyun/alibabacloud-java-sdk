// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GrantNetLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantNetLinkResponseBody body;

    public static GrantNetLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantNetLinkResponse self = new GrantNetLinkResponse();
        return TeaModel.build(map, self);
    }

    public GrantNetLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantNetLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantNetLinkResponse setBody(GrantNetLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantNetLinkResponseBody getBody() {
        return this.body;
    }

}
