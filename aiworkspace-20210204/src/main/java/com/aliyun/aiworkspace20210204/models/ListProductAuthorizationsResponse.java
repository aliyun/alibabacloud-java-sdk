// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListProductAuthorizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductAuthorizationsResponseBody body;

    public static ListProductAuthorizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductAuthorizationsResponse self = new ListProductAuthorizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductAuthorizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductAuthorizationsResponse setBody(ListProductAuthorizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductAuthorizationsResponseBody getBody() {
        return this.body;
    }

}
