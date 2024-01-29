// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteFlowTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFlowTagGroupResponseBody body;

    public static DeleteFlowTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowTagGroupResponse self = new DeleteFlowTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowTagGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlowTagGroupResponse setBody(DeleteFlowTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowTagGroupResponseBody getBody() {
        return this.body;
    }

}
