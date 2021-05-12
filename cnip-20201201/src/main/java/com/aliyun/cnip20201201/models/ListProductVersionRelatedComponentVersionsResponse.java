// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionRelatedComponentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductVersionRelatedComponentVersionsResponseBody body;

    public static ListProductVersionRelatedComponentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionRelatedComponentVersionsResponse self = new ListProductVersionRelatedComponentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductVersionRelatedComponentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductVersionRelatedComponentVersionsResponse setBody(ListProductVersionRelatedComponentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductVersionRelatedComponentVersionsResponseBody getBody() {
        return this.body;
    }

}
