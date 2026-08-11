// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgDeleteNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseOrgDeleteNodeResponseBody body;

    public static EnterpriseOrgDeleteNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgDeleteNodeResponse self = new EnterpriseOrgDeleteNodeResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgDeleteNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseOrgDeleteNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseOrgDeleteNodeResponse setBody(EnterpriseOrgDeleteNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseOrgDeleteNodeResponseBody getBody() {
        return this.body;
    }

}
