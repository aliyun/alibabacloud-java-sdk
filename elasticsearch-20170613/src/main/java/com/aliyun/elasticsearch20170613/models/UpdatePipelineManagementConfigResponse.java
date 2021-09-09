// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelineManagementConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdatePipelineManagementConfigResponse setBody(UpdatePipelineManagementConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineManagementConfigResponseBody getBody() {
        return this.body;
    }

}
