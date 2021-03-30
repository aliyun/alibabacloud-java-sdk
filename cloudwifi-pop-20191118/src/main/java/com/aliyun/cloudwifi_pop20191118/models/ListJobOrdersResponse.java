// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class ListJobOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobOrdersResponseBody body;

    public static ListJobOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobOrdersResponse self = new ListJobOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListJobOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobOrdersResponse setBody(ListJobOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobOrdersResponseBody getBody() {
        return this.body;
    }

}
