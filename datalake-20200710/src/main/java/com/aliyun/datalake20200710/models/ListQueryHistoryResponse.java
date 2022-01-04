// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListQueryHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQueryHistoryResponseBody body;

    public static ListQueryHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueryHistoryResponse self = new ListQueryHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListQueryHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueryHistoryResponse setBody(ListQueryHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueryHistoryResponseBody getBody() {
        return this.body;
    }

}
