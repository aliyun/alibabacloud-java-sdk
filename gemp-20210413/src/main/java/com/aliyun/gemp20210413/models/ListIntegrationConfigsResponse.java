// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListIntegrationConfigsResponse setBody(ListIntegrationConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationConfigsResponseBody getBody() {
        return this.body;
    }

}
