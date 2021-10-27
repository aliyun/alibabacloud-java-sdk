// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDeliveryHistoryJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListDeliveryHistoryJobsResponse setBody(ListDeliveryHistoryJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeliveryHistoryJobsResponseBody getBody() {
        return this.body;
    }

}
