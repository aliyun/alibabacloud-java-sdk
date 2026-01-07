// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseContactDeleteResponseBody body;

    public static EnterpriseContactDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactDeleteResponse self = new EnterpriseContactDeleteResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseContactDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseContactDeleteResponse setBody(EnterpriseContactDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseContactDeleteResponseBody getBody() {
        return this.body;
    }

}
