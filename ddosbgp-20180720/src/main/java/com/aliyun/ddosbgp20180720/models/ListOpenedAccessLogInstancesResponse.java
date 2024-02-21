// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListOpenedAccessLogInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListOpenedAccessLogInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOpenedAccessLogInstancesResponse setBody(ListOpenedAccessLogInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpenedAccessLogInstancesResponseBody getBody() {
        return this.body;
    }

}
