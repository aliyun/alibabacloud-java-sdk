// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAutomateResponseConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAutomateResponseConfigsResponseBody body;

    public static ListAutomateResponseConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutomateResponseConfigsResponse self = new ListAutomateResponseConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListAutomateResponseConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutomateResponseConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutomateResponseConfigsResponse setBody(ListAutomateResponseConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutomateResponseConfigsResponseBody getBody() {
        return this.body;
    }

}
