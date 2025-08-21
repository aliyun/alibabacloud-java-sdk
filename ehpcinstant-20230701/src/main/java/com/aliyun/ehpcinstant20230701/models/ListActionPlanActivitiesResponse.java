// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListActionPlanActivitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListActionPlanActivitiesResponseBody body;

    public static ListActionPlanActivitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActionPlanActivitiesResponse self = new ListActionPlanActivitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListActionPlanActivitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActionPlanActivitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActionPlanActivitiesResponse setBody(ListActionPlanActivitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActionPlanActivitiesResponseBody getBody() {
        return this.body;
    }

}
