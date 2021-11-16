// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListChartDataForServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListChartDataForServiceGroupResponse setBody(ListChartDataForServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChartDataForServiceGroupResponseBody getBody() {
        return this.body;
    }

}
