// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListLibraryStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLibraryStatusResponseBody body;

    public static ListLibraryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLibraryStatusResponse self = new ListLibraryStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListLibraryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLibraryStatusResponse setBody(ListLibraryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLibraryStatusResponseBody getBody() {
        return this.body;
    }

}
