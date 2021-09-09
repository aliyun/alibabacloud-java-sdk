// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPluginsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListKibanaPluginsResponseBody body;

    public static ListKibanaPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKibanaPluginsResponse self = new ListKibanaPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListKibanaPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKibanaPluginsResponse setBody(ListKibanaPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKibanaPluginsResponseBody getBody() {
        return this.body;
    }

}
