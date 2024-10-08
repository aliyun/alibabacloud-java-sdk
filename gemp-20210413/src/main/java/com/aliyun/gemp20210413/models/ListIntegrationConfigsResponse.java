// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationConfigsResponseBody body;

    public static ListIntegrationConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationConfigsResponse self = new ListIntegrationConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationConfigsResponse setBody(ListIntegrationConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationConfigsResponseBody getBody() {
        return this.body;
    }

}
