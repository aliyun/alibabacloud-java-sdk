// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBusiRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBusiRegionsResponseBody body;

    public static ListBusiRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusiRegionsResponse self = new ListBusiRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListBusiRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusiRegionsResponse setBody(ListBusiRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusiRegionsResponseBody getBody() {
        return this.body;
    }

}
