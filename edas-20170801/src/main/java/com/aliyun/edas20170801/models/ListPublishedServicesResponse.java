// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListPublishedServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublishedServicesResponseBody body;

    public static ListPublishedServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedServicesResponse self = new ListPublishedServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedServicesResponse setBody(ListPublishedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedServicesResponseBody getBody() {
        return this.body;
    }

}
