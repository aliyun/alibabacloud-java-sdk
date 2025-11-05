// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceGroupMetricDataResponseBody body;

    public static ListResourceGroupMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupMetricDataResponse self = new ListResourceGroupMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceGroupMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceGroupMetricDataResponse setBody(ListResourceGroupMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceGroupMetricDataResponseBody getBody() {
        return this.body;
    }

}
