// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserHostsResponseBody body;

    public static ListUserHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserHostsResponse self = new ListUserHostsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserHostsResponse setBody(ListUserHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserHostsResponseBody getBody() {
        return this.body;
    }

}
