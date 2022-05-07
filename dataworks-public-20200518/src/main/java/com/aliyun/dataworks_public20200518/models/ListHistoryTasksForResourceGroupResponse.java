// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListHistoryTasksForResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHistoryTasksForResourceGroupResponseBody body;

    public static ListHistoryTasksForResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryTasksForResourceGroupResponse self = new ListHistoryTasksForResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoryTasksForResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoryTasksForResourceGroupResponse setBody(ListHistoryTasksForResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoryTasksForResourceGroupResponseBody getBody() {
        return this.body;
    }

}
