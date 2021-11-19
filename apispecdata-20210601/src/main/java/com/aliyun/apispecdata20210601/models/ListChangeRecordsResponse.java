// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class ListChangeRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChangeRecordsResponseBody body;

    public static ListChangeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRecordsResponse self = new ListChangeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListChangeRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChangeRecordsResponse setBody(ListChangeRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChangeRecordsResponseBody getBody() {
        return this.body;
    }

}
