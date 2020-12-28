// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInvocationResultsResponseBody body;

    public static ListInvocationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationResultsResponse self = new ListInvocationResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListInvocationResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInvocationResultsResponse setBody(ListInvocationResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInvocationResultsResponseBody getBody() {
        return this.body;
    }

}
