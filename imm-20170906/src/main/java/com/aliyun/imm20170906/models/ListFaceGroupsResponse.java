// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListFaceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFaceGroupsResponseBody body;

    public static ListFaceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceGroupsResponse self = new ListFaceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFaceGroupsResponse setBody(ListFaceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFaceGroupsResponseBody getBody() {
        return this.body;
    }

}
