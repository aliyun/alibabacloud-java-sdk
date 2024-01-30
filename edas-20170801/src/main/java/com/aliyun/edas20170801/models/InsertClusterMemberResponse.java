// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertClusterMemberResponseBody body;

    public static InsertClusterMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertClusterMemberResponse self = new InsertClusterMemberResponse();
        return TeaModel.build(map, self);
    }

    public InsertClusterMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertClusterMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertClusterMemberResponse setBody(InsertClusterMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertClusterMemberResponseBody getBody() {
        return this.body;
    }

}
