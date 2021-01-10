// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistHistoryDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAssistHistoryDetailsResponseBody body;

    public static ListAssistHistoryDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssistHistoryDetailsResponse self = new ListAssistHistoryDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListAssistHistoryDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssistHistoryDetailsResponse setBody(ListAssistHistoryDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssistHistoryDetailsResponseBody getBody() {
        return this.body;
    }

}
