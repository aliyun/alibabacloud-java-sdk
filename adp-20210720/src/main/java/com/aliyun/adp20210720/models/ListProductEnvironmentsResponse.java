// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductEnvironmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductEnvironmentsResponseBody body;

    public static ListProductEnvironmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvironmentsResponse self = new ListProductEnvironmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductEnvironmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductEnvironmentsResponse setBody(ListProductEnvironmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductEnvironmentsResponseBody getBody() {
        return this.body;
    }

}
