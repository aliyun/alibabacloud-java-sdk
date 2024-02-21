// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDeliveryHistoryJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeliveryHistoryJobsResponseBody body;

    public static ListDeliveryHistoryJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryHistoryJobsResponse self = new ListDeliveryHistoryJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeliveryHistoryJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeliveryHistoryJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeliveryHistoryJobsResponse setBody(ListDeliveryHistoryJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeliveryHistoryJobsResponseBody getBody() {
        return this.body;
    }

}
