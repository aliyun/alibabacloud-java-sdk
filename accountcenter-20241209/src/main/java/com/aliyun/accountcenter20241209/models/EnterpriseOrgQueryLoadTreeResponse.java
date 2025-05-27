// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgQueryLoadTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseOrgQueryLoadTreeResponseBody body;

    public static EnterpriseOrgQueryLoadTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgQueryLoadTreeResponse self = new EnterpriseOrgQueryLoadTreeResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgQueryLoadTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseOrgQueryLoadTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseOrgQueryLoadTreeResponse setBody(EnterpriseOrgQueryLoadTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseOrgQueryLoadTreeResponseBody getBody() {
        return this.body;
    }

}
