// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListSavedQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSavedQueryResponseBody body;

    public static ListSavedQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSavedQueryResponse self = new ListSavedQueryResponse();
        return TeaModel.build(map, self);
    }

    public ListSavedQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSavedQueryResponse setBody(ListSavedQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSavedQueryResponseBody getBody() {
        return this.body;
    }

}
