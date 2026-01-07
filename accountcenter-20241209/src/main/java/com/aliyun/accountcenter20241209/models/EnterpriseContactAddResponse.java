// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseContactAddResponseBody body;

    public static EnterpriseContactAddResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactAddResponse self = new EnterpriseContactAddResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseContactAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseContactAddResponse setBody(EnterpriseContactAddResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseContactAddResponseBody getBody() {
        return this.body;
    }

}
