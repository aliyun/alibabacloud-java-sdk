// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComponentInstancesResponseBody body;

    public static ListComponentInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComponentInstancesResponse self = new ListComponentInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListComponentInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComponentInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComponentInstancesResponse setBody(ListComponentInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComponentInstancesResponseBody getBody() {
        return this.body;
    }

}
