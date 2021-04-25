// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListRunsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRunsResponseBody body;

    public static ListRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRunsResponse self = new ListRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRunsResponse setBody(ListRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRunsResponseBody getBody() {
        return this.body;
    }

}
