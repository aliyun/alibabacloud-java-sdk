// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceInstanceResourcesResponseBody body;

    public static ListServiceInstanceResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceResourcesResponse self = new ListServiceInstanceResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstanceResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceInstanceResourcesResponse setBody(ListServiceInstanceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstanceResourcesResponseBody getBody() {
        return this.body;
    }

}
