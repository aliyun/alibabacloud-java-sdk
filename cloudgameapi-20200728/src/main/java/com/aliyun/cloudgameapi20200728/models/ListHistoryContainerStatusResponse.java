// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListHistoryContainerStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHistoryContainerStatusResponseBody body;

    public static ListHistoryContainerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryContainerStatusResponse self = new ListHistoryContainerStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoryContainerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoryContainerStatusResponse setBody(ListHistoryContainerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoryContainerStatusResponseBody getBody() {
        return this.body;
    }

}
