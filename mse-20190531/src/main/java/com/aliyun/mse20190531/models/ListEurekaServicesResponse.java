// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEurekaServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListEurekaServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEurekaServicesResponse setBody(ListEurekaServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEurekaServicesResponseBody getBody() {
        return this.body;
    }

}
