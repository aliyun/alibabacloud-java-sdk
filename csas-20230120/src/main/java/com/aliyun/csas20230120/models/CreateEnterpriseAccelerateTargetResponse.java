// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateEnterpriseAccelerateTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEnterpriseAccelerateTargetResponseBody body;

    public static CreateEnterpriseAccelerateTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseAccelerateTargetResponse self = new CreateEnterpriseAccelerateTargetResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseAccelerateTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnterpriseAccelerateTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnterpriseAccelerateTargetResponse setBody(CreateEnterpriseAccelerateTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnterpriseAccelerateTargetResponseBody getBody() {
        return this.body;
    }

}
