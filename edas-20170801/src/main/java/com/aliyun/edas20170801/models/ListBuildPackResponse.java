// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListBuildPackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBuildPackResponseBody body;

    public static ListBuildPackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBuildPackResponse self = new ListBuildPackResponse();
        return TeaModel.build(map, self);
    }

    public ListBuildPackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBuildPackResponse setBody(ListBuildPackResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBuildPackResponseBody getBody() {
        return this.body;
    }

}
