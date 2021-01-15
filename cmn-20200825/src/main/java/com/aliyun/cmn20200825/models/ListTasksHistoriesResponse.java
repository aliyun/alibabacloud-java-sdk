// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListTasksHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTasksHistoriesResponseBody body;

    public static ListTasksHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTasksHistoriesResponse self = new ListTasksHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListTasksHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTasksHistoriesResponse setBody(ListTasksHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTasksHistoriesResponseBody getBody() {
        return this.body;
    }

}
