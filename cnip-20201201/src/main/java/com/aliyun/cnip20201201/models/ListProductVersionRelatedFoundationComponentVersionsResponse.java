// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionRelatedFoundationComponentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductVersionRelatedFoundationComponentVersionsResponseBody body;

    public static ListProductVersionRelatedFoundationComponentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionRelatedFoundationComponentVersionsResponse self = new ListProductVersionRelatedFoundationComponentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductVersionRelatedFoundationComponentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductVersionRelatedFoundationComponentVersionsResponse setBody(ListProductVersionRelatedFoundationComponentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductVersionRelatedFoundationComponentVersionsResponseBody getBody() {
        return this.body;
    }

}
