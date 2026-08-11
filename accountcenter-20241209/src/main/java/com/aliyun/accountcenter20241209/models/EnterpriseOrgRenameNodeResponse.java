// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgRenameNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseOrgRenameNodeResponseBody body;

    public static EnterpriseOrgRenameNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgRenameNodeResponse self = new EnterpriseOrgRenameNodeResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgRenameNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseOrgRenameNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseOrgRenameNodeResponse setBody(EnterpriseOrgRenameNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseOrgRenameNodeResponseBody getBody() {
        return this.body;
    }

}
