// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListNotificationHistoriesStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNotificationHistoriesStatisticsResponseBody body;

    public static ListNotificationHistoriesStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationHistoriesStatisticsResponse self = new ListNotificationHistoriesStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListNotificationHistoriesStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotificationHistoriesStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNotificationHistoriesStatisticsResponse setBody(ListNotificationHistoriesStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotificationHistoriesStatisticsResponseBody getBody() {
        return this.body;
    }

}
