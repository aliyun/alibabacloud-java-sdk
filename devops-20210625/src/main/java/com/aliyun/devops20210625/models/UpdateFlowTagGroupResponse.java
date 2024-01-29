// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateFlowTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateFlowTagGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlowTagGroupResponse setBody(UpdateFlowTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlowTagGroupResponseBody getBody() {
        return this.body;
    }

}
