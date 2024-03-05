// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListEnterpriseSupportPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnterpriseSupportPlanResponseBody body;

    public static ListEnterpriseSupportPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseSupportPlanResponse self = new ListEnterpriseSupportPlanResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseSupportPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseSupportPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterpriseSupportPlanResponse setBody(ListEnterpriseSupportPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseSupportPlanResponseBody getBody() {
        return this.body;
    }

}
