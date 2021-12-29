// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMemberResponseBody body;

    public static ListMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemberResponse self = new ListMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemberResponse setBody(ListMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemberResponseBody getBody() {
        return this.body;
    }

}
