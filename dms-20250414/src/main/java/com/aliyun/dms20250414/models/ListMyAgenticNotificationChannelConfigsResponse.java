// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListMyAgenticNotificationChannelConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMyAgenticNotificationChannelConfigsResponseBody body;

    public static ListMyAgenticNotificationChannelConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyAgenticNotificationChannelConfigsResponse self = new ListMyAgenticNotificationChannelConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListMyAgenticNotificationChannelConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyAgenticNotificationChannelConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMyAgenticNotificationChannelConfigsResponse setBody(ListMyAgenticNotificationChannelConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyAgenticNotificationChannelConfigsResponseBody getBody() {
        return this.body;
    }

}
