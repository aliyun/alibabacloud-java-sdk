// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlansByNoticeObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEscalationPlansByNoticeObjectResponseBody body;

    public static ListEscalationPlansByNoticeObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlansByNoticeObjectResponse self = new ListEscalationPlansByNoticeObjectResponse();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlansByNoticeObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEscalationPlansByNoticeObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEscalationPlansByNoticeObjectResponse setBody(ListEscalationPlansByNoticeObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEscalationPlansByNoticeObjectResponseBody getBody() {
        return this.body;
    }

}
