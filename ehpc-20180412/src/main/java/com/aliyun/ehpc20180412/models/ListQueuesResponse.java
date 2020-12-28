// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListQueuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQueuesResponseBody body;

    public static ListQueuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesResponse self = new ListQueuesResponse();
        return TeaModel.build(map, self);
    }

    public ListQueuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueuesResponse setBody(ListQueuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueuesResponseBody getBody() {
        return this.body;
    }

}
