// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateGroupConfigSynFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGroupConfigSynFlowResponseBody body;

    public static CreateGroupConfigSynFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupConfigSynFlowResponse self = new CreateGroupConfigSynFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupConfigSynFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupConfigSynFlowResponse setBody(CreateGroupConfigSynFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupConfigSynFlowResponseBody getBody() {
        return this.body;
    }

}
