// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvPodMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvPodMonitorsResponseBody body;

    public static ListEnvPodMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvPodMonitorsResponse self = new ListEnvPodMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvPodMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvPodMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvPodMonitorsResponse setBody(ListEnvPodMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvPodMonitorsResponseBody getBody() {
        return this.body;
    }

}
