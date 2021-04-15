// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEurekaInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEurekaInstancesResponseBody body;

    public static ListEurekaInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEurekaInstancesResponse self = new ListEurekaInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListEurekaInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEurekaInstancesResponse setBody(ListEurekaInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEurekaInstancesResponseBody getBody() {
        return this.body;
    }

}
