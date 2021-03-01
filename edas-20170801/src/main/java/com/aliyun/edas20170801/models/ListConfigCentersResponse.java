// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigCentersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigCentersResponseBody body;

    public static ListConfigCentersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigCentersResponse self = new ListConfigCentersResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigCentersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigCentersResponse setBody(ListConfigCentersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigCentersResponseBody getBody() {
        return this.body;
    }

}
