// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAlertLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudGtmAlertLogsResponseBody body;

    public static ListCloudGtmAlertLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAlertLogsResponse self = new ListCloudGtmAlertLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAlertLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudGtmAlertLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudGtmAlertLogsResponse setBody(ListCloudGtmAlertLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudGtmAlertLogsResponseBody getBody() {
        return this.body;
    }

}
