// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsByInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeMetricsByInstanceResponseBody body;

    public static ListComputeMetricsByInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeMetricsByInstanceResponse self = new ListComputeMetricsByInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeMetricsByInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeMetricsByInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeMetricsByInstanceResponse setBody(ListComputeMetricsByInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeMetricsByInstanceResponseBody getBody() {
        return this.body;
    }

}
