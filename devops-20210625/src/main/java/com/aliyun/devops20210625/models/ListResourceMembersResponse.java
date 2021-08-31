// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListResourceMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceMembersResponseBody body;

    public static ListResourceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceMembersResponse self = new ListResourceMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceMembersResponse setBody(ListResourceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceMembersResponseBody getBody() {
        return this.body;
    }

}
