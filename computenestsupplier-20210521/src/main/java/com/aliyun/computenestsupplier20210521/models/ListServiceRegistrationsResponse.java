// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceRegistrationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceRegistrationsResponseBody body;

    public static ListServiceRegistrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRegistrationsResponse self = new ListServiceRegistrationsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceRegistrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceRegistrationsResponse setBody(ListServiceRegistrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceRegistrationsResponseBody getBody() {
        return this.body;
    }

}
