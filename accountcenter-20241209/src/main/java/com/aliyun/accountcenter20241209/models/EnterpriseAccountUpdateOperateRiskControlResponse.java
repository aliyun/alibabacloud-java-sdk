// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateOperateRiskControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountUpdateOperateRiskControlResponseBody body;

    public static EnterpriseAccountUpdateOperateRiskControlResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateOperateRiskControlResponse self = new EnterpriseAccountUpdateOperateRiskControlResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateOperateRiskControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountUpdateOperateRiskControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountUpdateOperateRiskControlResponse setBody(EnterpriseAccountUpdateOperateRiskControlResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountUpdateOperateRiskControlResponseBody getBody() {
        return this.body;
    }

}
