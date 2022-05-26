// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateOrInsertEnterpriseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOrInsertEnterpriseInfoResponseBody body;

    public static UpdateOrInsertEnterpriseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrInsertEnterpriseInfoResponse self = new UpdateOrInsertEnterpriseInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOrInsertEnterpriseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOrInsertEnterpriseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOrInsertEnterpriseInfoResponse setBody(UpdateOrInsertEnterpriseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOrInsertEnterpriseInfoResponseBody getBody() {
        return this.body;
    }

}
