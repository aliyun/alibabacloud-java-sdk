// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSpaceResponseBody body;

    public static ListSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSpaceResponse self = new ListSpaceResponse();
        return TeaModel.build(map, self);
    }

    public ListSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSpaceResponse setBody(ListSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSpaceResponseBody getBody() {
        return this.body;
    }

}
