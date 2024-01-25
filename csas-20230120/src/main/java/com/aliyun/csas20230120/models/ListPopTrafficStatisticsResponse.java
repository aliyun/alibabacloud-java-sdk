// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPopTrafficStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPopTrafficStatisticsResponseBody body;

    public static ListPopTrafficStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPopTrafficStatisticsResponse self = new ListPopTrafficStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListPopTrafficStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPopTrafficStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPopTrafficStatisticsResponse setBody(ListPopTrafficStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPopTrafficStatisticsResponseBody getBody() {
        return this.body;
    }

}
