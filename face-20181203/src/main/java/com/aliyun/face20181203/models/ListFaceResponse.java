// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class ListFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFaceResponseBody body;

    public static ListFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceResponse self = new ListFaceResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFaceResponse setBody(ListFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFaceResponseBody getBody() {
        return this.body;
    }

}
