// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactEditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseContactEditResponseBody body;

    public static EnterpriseContactEditResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactEditResponse self = new EnterpriseContactEditResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseContactEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseContactEditResponse setBody(EnterpriseContactEditResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseContactEditResponseBody getBody() {
        return this.body;
    }

}
