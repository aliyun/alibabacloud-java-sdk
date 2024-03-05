// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListEnterpriseSupportPlanSimpleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnterpriseSupportPlanSimpleResponseBody body;

    public static ListEnterpriseSupportPlanSimpleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseSupportPlanSimpleResponse self = new ListEnterpriseSupportPlanSimpleResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseSupportPlanSimpleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseSupportPlanSimpleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterpriseSupportPlanSimpleResponse setBody(ListEnterpriseSupportPlanSimpleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseSupportPlanSimpleResponseBody getBody() {
        return this.body;
    }

}
