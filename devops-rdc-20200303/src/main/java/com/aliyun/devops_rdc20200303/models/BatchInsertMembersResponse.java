// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class BatchInsertMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchInsertMembersResponseBody body;

    public static BatchInsertMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchInsertMembersResponse self = new BatchInsertMembersResponse();
        return TeaModel.build(map, self);
    }

    public BatchInsertMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchInsertMembersResponse setBody(BatchInsertMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchInsertMembersResponseBody getBody() {
        return this.body;
    }

}
