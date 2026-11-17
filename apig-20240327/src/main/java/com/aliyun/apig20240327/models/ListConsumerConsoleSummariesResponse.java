// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerConsoleSummariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumerConsoleSummariesResponseBody body;

    public static ListConsumerConsoleSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerConsoleSummariesResponse self = new ListConsumerConsoleSummariesResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerConsoleSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerConsoleSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerConsoleSummariesResponse setBody(ListConsumerConsoleSummariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerConsoleSummariesResponseBody getBody() {
        return this.body;
    }

}
