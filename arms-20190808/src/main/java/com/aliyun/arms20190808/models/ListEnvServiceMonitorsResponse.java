// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvServiceMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvServiceMonitorsResponseBody body;

    public static ListEnvServiceMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvServiceMonitorsResponse self = new ListEnvServiceMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvServiceMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvServiceMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvServiceMonitorsResponse setBody(ListEnvServiceMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvServiceMonitorsResponseBody getBody() {
        return this.body;
    }

}
