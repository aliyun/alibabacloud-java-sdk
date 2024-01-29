// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateFlowTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowTagGroupResponseBody body;

    public static CreateFlowTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowTagGroupResponse self = new CreateFlowTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowTagGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowTagGroupResponse setBody(CreateFlowTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowTagGroupResponseBody getBody() {
        return this.body;
    }

}
