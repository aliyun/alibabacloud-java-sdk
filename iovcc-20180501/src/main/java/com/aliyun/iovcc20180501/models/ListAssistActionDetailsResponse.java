// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistActionDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAssistActionDetailsResponseBody body;

    public static ListAssistActionDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssistActionDetailsResponse self = new ListAssistActionDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListAssistActionDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssistActionDetailsResponse setBody(ListAssistActionDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssistActionDetailsResponseBody getBody() {
        return this.body;
    }

}
