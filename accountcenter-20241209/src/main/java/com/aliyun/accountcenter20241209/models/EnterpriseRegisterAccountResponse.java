// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRegisterAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseRegisterAccountResponseBody body;

    public static EnterpriseRegisterAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRegisterAccountResponse self = new EnterpriseRegisterAccountResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseRegisterAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseRegisterAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseRegisterAccountResponse setBody(EnterpriseRegisterAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseRegisterAccountResponseBody getBody() {
        return this.body;
    }

}
