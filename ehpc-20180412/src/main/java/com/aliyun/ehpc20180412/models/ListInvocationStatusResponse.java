// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInvocationStatusResponseBody body;

    public static ListInvocationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationStatusResponse self = new ListInvocationStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListInvocationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInvocationStatusResponse setBody(ListInvocationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInvocationStatusResponseBody getBody() {
        return this.body;
    }

}
