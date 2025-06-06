// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseAccelerateTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnterpriseAccelerateTargetResponseBody body;

    public static DeleteEnterpriseAccelerateTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseAccelerateTargetResponse self = new DeleteEnterpriseAccelerateTargetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseAccelerateTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnterpriseAccelerateTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnterpriseAccelerateTargetResponse setBody(DeleteEnterpriseAccelerateTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnterpriseAccelerateTargetResponseBody getBody() {
        return this.body;
    }

}
