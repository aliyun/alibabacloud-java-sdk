// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigTimelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIntegrationConfigTimelinesResponseBody body;

    public static ListIntegrationConfigTimelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationConfigTimelinesResponse self = new ListIntegrationConfigTimelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationConfigTimelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationConfigTimelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationConfigTimelinesResponse setBody(ListIntegrationConfigTimelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationConfigTimelinesResponseBody getBody() {
        return this.body;
    }

}
