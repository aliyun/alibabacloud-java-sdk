// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListAnalyticsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnalyticsDataResponseBody body;

    public static ListAnalyticsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnalyticsDataResponse self = new ListAnalyticsDataResponse();
        return TeaModel.build(map, self);
    }

    public ListAnalyticsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnalyticsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnalyticsDataResponse setBody(ListAnalyticsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnalyticsDataResponseBody getBody() {
        return this.body;
    }

}
