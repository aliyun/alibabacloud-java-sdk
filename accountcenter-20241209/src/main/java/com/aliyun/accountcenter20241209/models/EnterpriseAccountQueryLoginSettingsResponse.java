// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountQueryLoginSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseAccountQueryLoginSettingsResponseBody body;

    public static EnterpriseAccountQueryLoginSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountQueryLoginSettingsResponse self = new EnterpriseAccountQueryLoginSettingsResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountQueryLoginSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseAccountQueryLoginSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseAccountQueryLoginSettingsResponse setBody(EnterpriseAccountQueryLoginSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseAccountQueryLoginSettingsResponseBody getBody() {
        return this.body;
    }

}
