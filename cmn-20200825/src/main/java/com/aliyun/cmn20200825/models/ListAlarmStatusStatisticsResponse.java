// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlarmStatusStatisticsResponseBody body;

    public static ListAlarmStatusStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusStatisticsResponse self = new ListAlarmStatusStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmStatusStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlarmStatusStatisticsResponse setBody(ListAlarmStatusStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmStatusStatisticsResponseBody getBody() {
        return this.body;
    }

}
