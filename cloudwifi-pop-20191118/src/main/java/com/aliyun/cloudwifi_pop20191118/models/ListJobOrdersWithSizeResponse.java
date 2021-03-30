// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class ListJobOrdersWithSizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobOrdersWithSizeResponseBody body;

    public static ListJobOrdersWithSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobOrdersWithSizeResponse self = new ListJobOrdersWithSizeResponse();
        return TeaModel.build(map, self);
    }

    public ListJobOrdersWithSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobOrdersWithSizeResponse setBody(ListJobOrdersWithSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobOrdersWithSizeResponseBody getBody() {
        return this.body;
    }

}
