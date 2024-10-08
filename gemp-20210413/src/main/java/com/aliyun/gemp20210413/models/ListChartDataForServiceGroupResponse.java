// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListChartDataForServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChartDataForServiceGroupResponseBody body;

    public static ListChartDataForServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChartDataForServiceGroupResponse self = new ListChartDataForServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListChartDataForServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChartDataForServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChartDataForServiceGroupResponse setBody(ListChartDataForServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChartDataForServiceGroupResponseBody getBody() {
        return this.body;
    }

}
