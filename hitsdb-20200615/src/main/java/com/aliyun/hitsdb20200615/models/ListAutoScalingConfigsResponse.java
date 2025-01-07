// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListAutoScalingConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoScalingConfigsResponseBody body;

    public static ListAutoScalingConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingConfigsResponse self = new ListAutoScalingConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoScalingConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoScalingConfigsResponse setBody(ListAutoScalingConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoScalingConfigsResponseBody getBody() {
        return this.body;
    }

}
