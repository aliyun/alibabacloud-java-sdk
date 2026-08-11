// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgCreateNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseOrgCreateNodeResponseBody body;

    public static EnterpriseOrgCreateNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgCreateNodeResponse self = new EnterpriseOrgCreateNodeResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgCreateNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseOrgCreateNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseOrgCreateNodeResponse setBody(EnterpriseOrgCreateNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseOrgCreateNodeResponseBody getBody() {
        return this.body;
    }

}
