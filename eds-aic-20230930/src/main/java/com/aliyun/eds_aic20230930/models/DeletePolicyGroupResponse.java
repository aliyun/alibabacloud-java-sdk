// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeletePolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolicyGroupResponseBody body;

    public static DeletePolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyGroupResponse self = new DeletePolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyGroupResponse setBody(DeletePolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyGroupResponseBody getBody() {
        return this.body;
    }

}
