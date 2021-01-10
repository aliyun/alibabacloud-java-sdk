// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAssistHistoriesResponseBody body;

    public static ListAssistHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssistHistoriesResponse self = new ListAssistHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAssistHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssistHistoriesResponse setBody(ListAssistHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssistHistoriesResponseBody getBody() {
        return this.body;
    }

}
