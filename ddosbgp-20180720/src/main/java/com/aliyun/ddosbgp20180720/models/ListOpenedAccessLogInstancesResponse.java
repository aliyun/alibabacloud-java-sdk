// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListOpenedAccessLogInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOpenedAccessLogInstancesResponseBody body;

    public static ListOpenedAccessLogInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpenedAccessLogInstancesResponse self = new ListOpenedAccessLogInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListOpenedAccessLogInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpenedAccessLogInstancesResponse setBody(ListOpenedAccessLogInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenedAccessLogInstancesResponseBody getBody() {
        return this.body;
    }

}
