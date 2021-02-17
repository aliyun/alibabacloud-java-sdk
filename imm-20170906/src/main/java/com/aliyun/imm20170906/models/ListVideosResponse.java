// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVideosResponseBody body;

    public static ListVideosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVideosResponse self = new ListVideosResponse();
        return TeaModel.build(map, self);
    }

    public ListVideosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVideosResponse setBody(ListVideosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVideosResponseBody getBody() {
        return this.body;
    }

}
