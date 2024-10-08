// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlanServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEscalationPlanServicesResponseBody body;

    public static ListEscalationPlanServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlanServicesResponse self = new ListEscalationPlanServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlanServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEscalationPlanServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEscalationPlanServicesResponse setBody(ListEscalationPlanServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEscalationPlanServicesResponseBody getBody() {
        return this.body;
    }

}
