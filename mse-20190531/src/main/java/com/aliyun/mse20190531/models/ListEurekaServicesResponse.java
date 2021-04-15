// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEurekaServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEurekaServicesResponseBody body;

    public static ListEurekaServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEurekaServicesResponse self = new ListEurekaServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListEurekaServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEurekaServicesResponse setBody(ListEurekaServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEurekaServicesResponseBody getBody() {
        return this.body;
    }

}
