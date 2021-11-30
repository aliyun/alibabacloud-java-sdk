// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceServicesResponseBody body;

    public static ListResourceServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServicesResponse self = new ListResourceServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceServicesResponse setBody(ListResourceServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceServicesResponseBody getBody() {
        return this.body;
    }

}
