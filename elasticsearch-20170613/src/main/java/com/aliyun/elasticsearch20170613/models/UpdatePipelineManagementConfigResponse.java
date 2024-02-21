// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelineManagementConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePipelineManagementConfigResponseBody body;

    public static UpdatePipelineManagementConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineManagementConfigResponse self = new UpdatePipelineManagementConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineManagementConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineManagementConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePipelineManagementConfigResponse setBody(UpdatePipelineManagementConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineManagementConfigResponseBody getBody() {
        return this.body;
    }

}
