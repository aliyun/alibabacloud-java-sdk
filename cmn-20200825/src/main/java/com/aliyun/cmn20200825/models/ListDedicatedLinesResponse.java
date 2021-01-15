// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDedicatedLinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDedicatedLinesResponseBody body;

    public static ListDedicatedLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDedicatedLinesResponse self = new ListDedicatedLinesResponse();
        return TeaModel.build(map, self);
    }

    public ListDedicatedLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDedicatedLinesResponse setBody(ListDedicatedLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDedicatedLinesResponseBody getBody() {
        return this.body;
    }

}
