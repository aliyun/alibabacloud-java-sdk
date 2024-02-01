// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceInstancesResponseBody body;

    public static ListServiceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesResponse self = new ListServiceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceInstancesResponse setBody(ListServiceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstancesResponseBody getBody() {
        return this.body;
    }

}
