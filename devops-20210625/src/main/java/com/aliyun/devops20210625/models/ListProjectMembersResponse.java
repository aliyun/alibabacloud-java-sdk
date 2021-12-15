// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectMembersResponseBody body;

    public static ListProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersResponse self = new ListProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectMembersResponse setBody(ListProjectMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectMembersResponseBody getBody() {
        return this.body;
    }

}
