// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRemediationsResponseBody body;

    public static ListRemediationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationsResponse self = new ListRemediationsResponse();
        return TeaModel.build(map, self);
    }

    public ListRemediationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRemediationsResponse setBody(ListRemediationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRemediationsResponseBody getBody() {
        return this.body;
    }

}
