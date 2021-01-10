// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientPluginsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClientPluginsResponseBody body;

    public static ListClientPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientPluginsResponse self = new ListClientPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListClientPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientPluginsResponse setBody(ListClientPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientPluginsResponseBody getBody() {
        return this.body;
    }

}
