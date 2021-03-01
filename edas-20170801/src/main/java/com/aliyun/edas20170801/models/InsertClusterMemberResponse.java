// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InsertClusterMemberResponse setBody(InsertClusterMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertClusterMemberResponseBody getBody() {
        return this.body;
    }

}
