// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListFoundationVersionRelatedComponentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFoundationVersionRelatedComponentVersionsResponseBody body;

    public static ListFoundationVersionRelatedComponentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationVersionRelatedComponentVersionsResponse self = new ListFoundationVersionRelatedComponentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFoundationVersionRelatedComponentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFoundationVersionRelatedComponentVersionsResponse setBody(ListFoundationVersionRelatedComponentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFoundationVersionRelatedComponentVersionsResponseBody getBody() {
        return this.body;
    }

}
