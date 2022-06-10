// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListStatefulAsyncInvocationsResponseBody body;

    public static ListStatefulAsyncInvocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationsResponse self = new ListStatefulAsyncInvocationsResponse();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStatefulAsyncInvocationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStatefulAsyncInvocationsResponse setBody(ListStatefulAsyncInvocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStatefulAsyncInvocationsResponseBody getBody() {
        return this.body;
    }

}
