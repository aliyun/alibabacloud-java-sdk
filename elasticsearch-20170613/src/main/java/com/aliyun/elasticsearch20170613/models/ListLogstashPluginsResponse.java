// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashPluginsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogstashPluginsResponseBody body;

    public static ListLogstashPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashPluginsResponse self = new ListLogstashPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogstashPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogstashPluginsResponse setBody(ListLogstashPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogstashPluginsResponseBody getBody() {
        return this.body;
    }

}
