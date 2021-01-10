// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListInvocationLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInvocationLogsResponseBody body;

    public static ListInvocationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationLogsResponse self = new ListInvocationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListInvocationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInvocationLogsResponse setBody(ListInvocationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInvocationLogsResponseBody getBody() {
        return this.body;
    }

}
