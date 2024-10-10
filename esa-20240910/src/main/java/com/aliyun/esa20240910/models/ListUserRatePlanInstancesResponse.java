// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRatePlanInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserRatePlanInstancesResponseBody body;

    public static ListUserRatePlanInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserRatePlanInstancesResponse self = new ListUserRatePlanInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserRatePlanInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserRatePlanInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserRatePlanInstancesResponse setBody(ListUserRatePlanInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserRatePlanInstancesResponseBody getBody() {
        return this.body;
    }

}
