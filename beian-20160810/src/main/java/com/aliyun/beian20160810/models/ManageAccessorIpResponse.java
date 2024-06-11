// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ManageAccessorIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageAccessorIpResponseBody body;

    public static ManageAccessorIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageAccessorIpResponse self = new ManageAccessorIpResponse();
        return TeaModel.build(map, self);
    }

    public ManageAccessorIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageAccessorIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageAccessorIpResponse setBody(ManageAccessorIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageAccessorIpResponseBody getBody() {
        return this.body;
    }

}
