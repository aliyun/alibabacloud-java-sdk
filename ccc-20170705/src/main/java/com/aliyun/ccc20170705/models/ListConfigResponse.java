// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigResponseBody body;

    public static ListConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigResponse self = new ListConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigResponse setBody(ListConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigResponseBody getBody() {
        return this.body;
    }

}
