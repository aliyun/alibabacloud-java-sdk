// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteClusterMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClusterMemberResponseBody body;

    public static DeleteClusterMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterMemberResponse self = new DeleteClusterMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClusterMemberResponse setBody(DeleteClusterMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterMemberResponseBody getBody() {
        return this.body;
    }

}
