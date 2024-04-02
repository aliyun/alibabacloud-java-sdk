// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyWebsiteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyWebsiteInstanceResponseBody body;

    public static VerifyWebsiteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyWebsiteInstanceResponse self = new VerifyWebsiteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public VerifyWebsiteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyWebsiteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyWebsiteInstanceResponse setBody(VerifyWebsiteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyWebsiteInstanceResponseBody getBody() {
        return this.body;
    }

}
