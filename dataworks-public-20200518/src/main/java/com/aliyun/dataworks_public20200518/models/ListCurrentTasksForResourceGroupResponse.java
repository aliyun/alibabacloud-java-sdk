// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCurrentTasksForResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCurrentTasksForResourceGroupResponseBody body;

    public static ListCurrentTasksForResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentTasksForResourceGroupResponse self = new ListCurrentTasksForResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListCurrentTasksForResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCurrentTasksForResourceGroupResponse setBody(ListCurrentTasksForResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCurrentTasksForResourceGroupResponseBody getBody() {
        return this.body;
    }

}
