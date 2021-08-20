// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListMergeRequestsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMergeRequestsResponseBody body;

    public static ListMergeRequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestsResponse self = new ListMergeRequestsResponse();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMergeRequestsResponse setBody(ListMergeRequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMergeRequestsResponseBody getBody() {
        return this.body;
    }

}
