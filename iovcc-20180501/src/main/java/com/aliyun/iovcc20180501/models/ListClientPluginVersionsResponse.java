// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientPluginVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClientPluginVersionsResponseBody body;

    public static ListClientPluginVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientPluginVersionsResponse self = new ListClientPluginVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListClientPluginVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientPluginVersionsResponse setBody(ListClientPluginVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientPluginVersionsResponseBody getBody() {
        return this.body;
    }

}
