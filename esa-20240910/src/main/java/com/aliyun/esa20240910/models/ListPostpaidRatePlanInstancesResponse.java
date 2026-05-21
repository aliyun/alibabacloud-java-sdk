// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidRatePlanInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPostpaidRatePlanInstancesResponseBody body;

    public static ListPostpaidRatePlanInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPostpaidRatePlanInstancesResponse self = new ListPostpaidRatePlanInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListPostpaidRatePlanInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPostpaidRatePlanInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPostpaidRatePlanInstancesResponse setBody(ListPostpaidRatePlanInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPostpaidRatePlanInstancesResponseBody getBody() {
        return this.body;
    }

}
