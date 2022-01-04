// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMetastoreMigrationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMetastoreMigrationsResponseBody body;

    public static ListMetastoreMigrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetastoreMigrationsResponse self = new ListMetastoreMigrationsResponse();
        return TeaModel.build(map, self);
    }

    public ListMetastoreMigrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetastoreMigrationsResponse setBody(ListMetastoreMigrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetastoreMigrationsResponseBody getBody() {
        return this.body;
    }

}
