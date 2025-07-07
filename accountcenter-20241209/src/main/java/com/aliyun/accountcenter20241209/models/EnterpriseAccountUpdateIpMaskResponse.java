// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateIpMaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountUpdateIpMaskResponseBody body;

    public static EnterpriseAccountUpdateIpMaskResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateIpMaskResponse self = new EnterpriseAccountUpdateIpMaskResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateIpMaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountUpdateIpMaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountUpdateIpMaskResponse setBody(EnterpriseAccountUpdateIpMaskResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountUpdateIpMaskResponseBody getBody() {
        return this.body;
    }

}
