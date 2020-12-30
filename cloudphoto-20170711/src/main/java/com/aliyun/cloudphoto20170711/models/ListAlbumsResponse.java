// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListAlbumsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlbumsResponseBody body;

    public static ListAlbumsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumsResponse self = new ListAlbumsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlbumsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlbumsResponse setBody(ListAlbumsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlbumsResponseBody getBody() {
        return this.body;
    }

}
