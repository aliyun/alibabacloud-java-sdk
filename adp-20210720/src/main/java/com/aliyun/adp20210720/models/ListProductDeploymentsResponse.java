// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductDeploymentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductDeploymentsResponseBody body;

    public static ListProductDeploymentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductDeploymentsResponse self = new ListProductDeploymentsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductDeploymentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductDeploymentsResponse setBody(ListProductDeploymentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductDeploymentsResponseBody getBody() {
        return this.body;
    }

}
