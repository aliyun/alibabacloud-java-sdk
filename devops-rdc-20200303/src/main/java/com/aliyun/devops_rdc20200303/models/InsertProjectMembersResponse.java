// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class InsertProjectMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertProjectMembersResponseBody body;

    public static InsertProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertProjectMembersResponse self = new InsertProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public InsertProjectMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertProjectMembersResponse setBody(InsertProjectMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertProjectMembersResponseBody getBody() {
        return this.body;
    }

}
