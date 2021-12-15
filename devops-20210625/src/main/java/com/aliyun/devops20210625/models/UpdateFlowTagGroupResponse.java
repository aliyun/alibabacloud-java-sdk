// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateFlowTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlowTagGroupResponseBody body;

    public static UpdateFlowTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowTagGroupResponse self = new UpdateFlowTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowTagGroupResponse setBody(UpdateFlowTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlowTagGroupResponseBody getBody() {
        return this.body;
    }

}
