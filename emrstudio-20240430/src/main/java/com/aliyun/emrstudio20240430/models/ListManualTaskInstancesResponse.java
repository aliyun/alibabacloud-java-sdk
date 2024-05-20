// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListManualTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListManualTaskInstancesResponseBody body;

    public static ListManualTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManualTaskInstancesResponse self = new ListManualTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListManualTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListManualTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListManualTaskInstancesResponse setBody(ListManualTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListManualTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
