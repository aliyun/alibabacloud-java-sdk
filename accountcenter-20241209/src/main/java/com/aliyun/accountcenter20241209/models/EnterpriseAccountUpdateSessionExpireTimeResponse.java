// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateSessionExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountUpdateSessionExpireTimeResponseBody body;

    public static EnterpriseAccountUpdateSessionExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateSessionExpireTimeResponse self = new EnterpriseAccountUpdateSessionExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateSessionExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountUpdateSessionExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountUpdateSessionExpireTimeResponse setBody(EnterpriseAccountUpdateSessionExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountUpdateSessionExpireTimeResponseBody getBody() {
        return this.body;
    }

}
