// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcdpAimResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMcdpAimResponseBody body;

    public static ListMcdpAimResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcdpAimResponse self = new ListMcdpAimResponse();
        return TeaModel.build(map, self);
    }

    public ListMcdpAimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcdpAimResponse setBody(ListMcdpAimResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcdpAimResponseBody getBody() {
        return this.body;
    }

}
