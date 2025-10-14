// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListTrafficStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrafficStatisticsResponseBody body;

    public static ListTrafficStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficStatisticsResponse self = new ListTrafficStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrafficStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrafficStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrafficStatisticsResponse setBody(ListTrafficStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrafficStatisticsResponseBody getBody() {
        return this.body;
    }

}
