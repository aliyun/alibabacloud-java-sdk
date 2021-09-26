// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListDatasourceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatasourceInstancesResponseBody body;

    public static ListDatasourceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourceInstancesResponse self = new ListDatasourceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasourceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasourceInstancesResponse setBody(ListDatasourceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasourceInstancesResponseBody getBody() {
        return this.body;
    }

}
