// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListDatasetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatasetsResponseBody body;

    public static ListDatasetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponse self = new ListDatasetsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetsResponse setBody(ListDatasetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetsResponseBody getBody() {
        return this.body;
    }

}
