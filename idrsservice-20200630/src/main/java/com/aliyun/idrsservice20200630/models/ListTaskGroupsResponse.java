// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskGroupsResponseBody body;

    public static ListTaskGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupsResponse self = new ListTaskGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskGroupsResponse setBody(ListTaskGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskGroupsResponseBody getBody() {
        return this.body;
    }

}
