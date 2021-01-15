// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInspectionTasksResponseBody body;

    public static ListInspectionTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTasksResponse self = new ListInspectionTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListInspectionTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInspectionTasksResponse setBody(ListInspectionTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInspectionTasksResponseBody getBody() {
        return this.body;
    }

}
