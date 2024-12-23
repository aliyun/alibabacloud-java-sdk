// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateAndPublishAgentSelectiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAndPublishAgentSelectiveResponseBody body;

    public static UpdateAndPublishAgentSelectiveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndPublishAgentSelectiveResponse self = new UpdateAndPublishAgentSelectiveResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAndPublishAgentSelectiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAndPublishAgentSelectiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAndPublishAgentSelectiveResponse setBody(UpdateAndPublishAgentSelectiveResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAndPublishAgentSelectiveResponseBody getBody() {
        return this.body;
    }

}
