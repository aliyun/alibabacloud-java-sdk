// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAcceleratorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBasicAcceleratorsResponseBody body;

    public static ListBasicAcceleratorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAcceleratorsResponse self = new ListBasicAcceleratorsResponse();
        return TeaModel.build(map, self);
    }

    public ListBasicAcceleratorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBasicAcceleratorsResponse setBody(ListBasicAcceleratorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBasicAcceleratorsResponseBody getBody() {
        return this.body;
    }

}
