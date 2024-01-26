// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeletePolicyGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolicyGroupsResponseBody body;

    public static DeletePolicyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyGroupsResponse self = new DeletePolicyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyGroupsResponse setBody(DeletePolicyGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyGroupsResponseBody getBody() {
        return this.body;
    }

}
