// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListCodeSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCodeSourcesResponseBody body;

    public static ListCodeSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCodeSourcesResponse self = new ListCodeSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListCodeSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCodeSourcesResponse setBody(ListCodeSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCodeSourcesResponseBody getBody() {
        return this.body;
    }

}
