// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFlowTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFlowTagGroupResponseBody body;

    public static GetFlowTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowTagGroupResponse self = new GetFlowTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowTagGroupResponse setBody(GetFlowTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowTagGroupResponseBody getBody() {
        return this.body;
    }

}
