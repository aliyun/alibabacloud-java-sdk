// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListEnvironmentOverviewsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentOverviewsResponseBody body;

    public static ListEnvironmentOverviewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentOverviewsResponse self = new ListEnvironmentOverviewsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentOverviewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentOverviewsResponse setBody(ListEnvironmentOverviewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentOverviewsResponseBody getBody() {
        return this.body;
    }

}
