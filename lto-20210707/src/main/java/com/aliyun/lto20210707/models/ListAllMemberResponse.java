// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllMemberResponseBody body;

    public static ListAllMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllMemberResponse self = new ListAllMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListAllMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllMemberResponse setBody(ListAllMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllMemberResponseBody getBody() {
        return this.body;
    }

}
