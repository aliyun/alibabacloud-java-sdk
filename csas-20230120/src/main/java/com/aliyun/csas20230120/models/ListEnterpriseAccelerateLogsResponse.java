// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListEnterpriseAccelerateLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnterpriseAccelerateLogsResponseBody body;

    public static ListEnterpriseAccelerateLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseAccelerateLogsResponse self = new ListEnterpriseAccelerateLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseAccelerateLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseAccelerateLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterpriseAccelerateLogsResponse setBody(ListEnterpriseAccelerateLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseAccelerateLogsResponseBody getBody() {
        return this.body;
    }

}
