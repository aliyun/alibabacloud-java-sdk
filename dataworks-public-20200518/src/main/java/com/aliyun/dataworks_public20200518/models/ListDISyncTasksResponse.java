// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDISyncTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDISyncTasksResponseBody body;

    public static ListDISyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDISyncTasksResponse self = new ListDISyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDISyncTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDISyncTasksResponse setBody(ListDISyncTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDISyncTasksResponseBody getBody() {
        return this.body;
    }

}
