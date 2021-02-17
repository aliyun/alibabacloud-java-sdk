// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoFramesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVideoFramesResponseBody body;

    public static ListVideoFramesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVideoFramesResponse self = new ListVideoFramesResponse();
        return TeaModel.build(map, self);
    }

    public ListVideoFramesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVideoFramesResponse setBody(ListVideoFramesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVideoFramesResponseBody getBody() {
        return this.body;
    }

}
