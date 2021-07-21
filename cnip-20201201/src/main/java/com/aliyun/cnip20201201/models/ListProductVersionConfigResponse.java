// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductVersionConfigResponseBody body;

    public static ListProductVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionConfigResponse self = new ListProductVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListProductVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductVersionConfigResponse setBody(ListProductVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductVersionConfigResponseBody getBody() {
        return this.body;
    }

}
