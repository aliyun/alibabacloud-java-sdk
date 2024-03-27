// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PublishAndDeployTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishAndDeployTaskFlowResponseBody body;

    public static PublishAndDeployTaskFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishAndDeployTaskFlowResponse self = new PublishAndDeployTaskFlowResponse();
        return TeaModel.build(map, self);
    }

    public PublishAndDeployTaskFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishAndDeployTaskFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishAndDeployTaskFlowResponse setBody(PublishAndDeployTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishAndDeployTaskFlowResponseBody getBody() {
        return this.body;
    }

}
